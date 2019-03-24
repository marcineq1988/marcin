package com.marcin.controller;

import com.marcin.entity.User;
import com.marcin.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @Autowired
    UserRepository userRepository;

    @PostMapping("loginUser")
    public String loginToUserAccount(@RequestParam("login") String login,
                                     @RequestParam("password") String password, Model model) {

        model.addAttribute("login", login);
        model.addAttribute("password", password);

        User loggedUser = userRepository.getByLogin(login);

        model.addAttribute("user", loggedUser);

        //to ma być zastąpione getem z bazy danych

       /* User newUser = new User(
                4,
                "cwaniak123",
                "haslo",
                "Adam",
                "Nowak",
                "Wroclaw",
                "50-545",
                "Kolejowa",
                22,
                12,
                "765556554");*/

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
