package com.marcin.controller;

import com.marcin.entity.User;
import com.marcin.entity.User2;
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
    private UserRepository userRepository;

    @GetMapping("/")
    public String sayHello(Model model) {

        System.out.println("testujemy");

        User user = userRepository.findUserByName("Marcin");
        //System.out.println(user.getCity());

        List<String> listaRandomowychStringow = Arrays.asList("Marcin", "Emilia", "Krzysztof", "Eustachy");

        model.addAttribute("name", "Marcin");
        model.addAttribute("names", listaRandomowychStringow);

        return "index";
    }

    @GetMapping("toLoginPage")
    public String goToLoginPage(Model model) {

        User2 user = new User2("marcineq1988", "haslo",
                "Marcin", "Pikula", "Wroclaw", "59-800", "Kamienna",
                115, 27, "687443222");

        //User2 user = new User2();

        model.addAttribute("user", user);

        return "login";
    }
}
