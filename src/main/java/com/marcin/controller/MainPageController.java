package com.marcin.controller;

import com.marcin.entity.User;
import com.marcin.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainPageController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/")
    public String listView(Model model) {

        User user = new User(
                "marcineq1988",
                "haslo",
                "Marcin",
                "Pikula",
                "Wroclaw",
                "50-545",
                "Kamienna",
                115,
                27,
                "661249888"
        );

        if (userRepository.findByLogin(user.getLogin()).size() < 1) {

            userRepository.save(user);
        }

        model.addAttribute("users", userRepository.findAll());

        return "main";
    }
}
