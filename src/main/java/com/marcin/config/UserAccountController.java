package com.marcin.config;

import com.marcin.entity.User;
import com.marcin.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.*;

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
    public String userAccountPostView(@ModelAttribute("user") User user, Model model) {

        List<User> users = userRepository.findByLogin(user.getLogin());

        if (users.size() == 0) {

            model.addAttribute("loginMessage", NO_USER_FOUND);

            return "login";
        }

        if (users.size() == 1) {

            if (!user.getPassword().equals(users.get(0).getPassword())) {

                model.addAttribute("loginMessage", WRONG_PASSWORD);

                return "login";
            }

            if (user.getPassword().equals(users.get(0).getPassword())) {

                model.addAttribute("loginMessage", LOGIN_SUCCESS);
                model.addAttribute("loggedUser", users.get(0));

                return "userAccount";
            }
        }

        return "login";
    }

    @PostMapping("saveEditedUserData")
    public String saveEditedUSerData(@ModelAttribute("user") User loggedUser, Model model) {

        User user = userRepository.findUserByLogin(loggedUser.getLogin());

        userRepository.save(user);

        model.addAttribute("loggedUser",loggedUser);

        return "userAccount";
    }

    @GetMapping(value = "/ajaxtest")
    @ResponseBody
    public String getTime() {

        List<String> someListWithRandomText = new ArrayList<>();

        someListWithRandomText.add("pierwszy");
        someListWithRandomText.add("drugi");
        someListWithRandomText.add("trzeci");
        someListWithRandomText.add("czwarty");

        Random rand = new Random();
        return String.valueOf(someListWithRandomText.get(rand.nextInt((3 - 0) + 1) + 0));
    }

    @GetMapping(value = "/currentHour")
    @ResponseBody
    public String getHour() {


        LocalDateTime now = LocalDateTime.now();
        int hour = now.getHour();
        int minutes = now.getMinute();
        int seconds = now.getSecond();

        return "Aktualna godzina: " + hour + ":" + minutes + ":" + seconds;
    }
}

