package com.marcin.controller;

import com.marcin.entity.User;
import com.marcin.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class MainPageController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/")
    public String sayHello(Model model) {

        List<String> listaRandomowychStringow = Arrays.asList("Marcin", "Emilia", "Krzysztof", "Eustachy");


        User newUser = new User(
                3,
                "xyz123login",
                "haslo",
                "Edmund",
                "Konopka",
                "Wroclaw",
                "50-545",
                "Kolejowa",
                32,
                22,
                "654335337");

        userRepository.save(newUser);

        List<User> listofusers = userRepository.findByLogin("xyz123login");


       // model.addAttribute("name", user.getName());
        model.addAttribute("names", listaRandomowychStringow);

        return "index";
    }

    @GetMapping("toLoginPage")
    public String goToLoginPage(Model model) {

        User newUser = new User(
                3,
                "xyz123login",
                "haslo",
                "Edmund",
                "Konopka",
                "Wroclaw",
                "50-545",
                "Kolejowa",
                32,
                22,
                "654335337");

        model.addAttribute("user", newUser);

        return "login";
    }
}
