package com.marcin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @PostMapping("loginUser")
    public String loginToUserAccount(@RequestParam("login") String login,
                                     @RequestParam("password") String password, Model model) {

        model.addAttribute("login", login);
        model.addAttribute("password", password);

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
