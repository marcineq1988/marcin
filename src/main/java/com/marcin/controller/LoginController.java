package com.marcin.controller;

import com.marcin.entity.User;
import com.marcin.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("toUserAccount")
    public String toLoginAccount() {

        return "userAccount";
    }

    @GetMapping("login")
    public String login(Model model) {

        User user = new User();

        model.addAttribute("user", user);

        return "login";
    }


    @PostMapping("login")
    public String loginToUserAccount(@RequestParam("login") String login,
                                     @RequestParam("password") String password, Model model) {

        model.addAttribute("login", login);
        model.addAttribute("password", password);

        User loggedUser = userRepository.getByLogin(login);

        model.addAttribute("user", loggedUser);

        return "userAccount";
    }

    @PostMapping("registerUser")
    public String registerUserAndLoginToUserAccount(@RequestParam("registerLogin") String login,
                                                    @RequestParam("registerPassword") String password, Model model) {

        model.addAttribute("registrationSuccess", true);
        model.addAttribute("login", login);
        model.addAttribute("password", password);

        return "userAccount";
    }


}
