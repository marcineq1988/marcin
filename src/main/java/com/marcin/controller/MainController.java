package com.marcin.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Controller
public class MainController {

    @GetMapping("/")
    public String getMainPage() {

        return "main";
    }

    @GetMapping("userAccount")
    public String getUserAccountPage() {

        return "userAccount";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String loginPage(@RequestParam(value = "error", required = false) String error,
                            @RequestParam(value = "logout", required = false) String logout,
                            Model model) {
        String errorMessge = null;
        if(error != null) {
            errorMessge = "Username or Password is incorrect!";
        }
        if(logout != null) {
            errorMessge = "You have been successfully logged out!";
        }
        model.addAttribute("errorMessge", errorMessge);
        return "login";
    }
  
    @RequestMapping(value="/logout", method = RequestMethod.GET)
    public String logoutPage (HttpServletRequest request, HttpServletResponse response) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (auth != null){   
            new SecurityContextLogoutHandler().logout(request, response, auth);
        }
        return "redirect:/login?logout=true";
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

    /*

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

    */
}