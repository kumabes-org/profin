package br.com.kumabe.profin.controllers;

import br.com.kumabe.profin.dtos.UserDTO;
import br.com.kumabe.profin.models.User;
import br.com.kumabe.profin.services.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("users")
public class UserController {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);
    private final UserService userService;

    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }

    @PostMapping
    public ModelAndView createUser(@ModelAttribute User user) {
        LOGGER.info("User: {}", user);
        userService.create(user);
        ModelAndView modelAndView = new ModelAndView("redirect:/users");
        return modelAndView;
    }

    @GetMapping("/new")
    public ModelAndView newUser(){
        ModelAndView modelAndView = new ModelAndView("../pages/users/new");
        User user = new User();
        modelAndView.addObject("user", user);
        return modelAndView;
    }

    @GetMapping
    public ModelAndView listUser(){
        ModelAndView modelAndView = new ModelAndView("../pages/users/index");
        List<User> users = userService.list();
        modelAndView.addObject("users", users);
        return modelAndView;
    }
}
