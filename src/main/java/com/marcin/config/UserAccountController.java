package com.marcin.config;

import com.marcin.entity.User;
import com.marcin.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class UserAccountController {

    private static final String NO_USER_FOUND = "Uzytkownik nie istnieje";
    private static final String WRONG_PASSWORD = "Niepoprawne haslo!";
    private static final String LOGIN_SUCCESS = "Zalogowano!";

    @Autowired
    private UserRepository userRepository;

    @GetMapping("login")
    public String loginView() {

        return "login";
    }

    @GetMapping("userAccount")
    public String userAccountGetView() {

        return "login";
    }

    @PostMapping("userAccount")
    public String userAccountPostView(@RequestParam("login") String login,
                                      @RequestParam("password") String password, Model model) {

        List<User> users = userRepository.findByLogin(login);

        if (users.size() == 0) {

            model.addAttribute("loginMessage", NO_USER_FOUND);

            return "login";
        }

        if (users.size() == 1) {

            if (!password.equals(users.get(0).getPassword())) {

                model.addAttribute("loginMessage", WRONG_PASSWORD);

                return "login";
            }

            if (password.equals(users.get(0).getPassword())) {

                model.addAttribute("loginMessage", LOGIN_SUCCESS);

                return "userAccount";
            }

            return "userAccount";
        }

        return "login";
    }
}
