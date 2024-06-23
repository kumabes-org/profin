package br.com.kumabe.profin.controllers;

import br.com.kumabe.profin.models.Role;
import br.com.kumabe.profin.models.User;
import br.com.kumabe.profin.services.RoleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("roles")
public class RoleController {
    private static final Logger LOGGER = LoggerFactory.getLogger(RoleController.class);
    private final RoleService roleService;

    @Autowired
    public RoleController(RoleService roleService){
        this.roleService = roleService;
    }

    @GetMapping
    public ModelAndView listRole(){
        ModelAndView modelAndView = new ModelAndView("../pages/roles/index");
        List<Role> roles = roleService.list();
        modelAndView.addObject("roles", roles);
        return modelAndView;
    }
}
