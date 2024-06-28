package br.com.kumabe.profin.controllers;

import br.com.kumabe.profin.models.Customer;
import br.com.kumabe.profin.models.User;
import br.com.kumabe.profin.services.AddressService;
import br.com.kumabe.profin.services.CustomerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("customers")
public class CustomerController {
    private static final Logger LOGGER = LoggerFactory.getLogger(CustomerController.class);
    private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService){
        this.customerService = customerService;
    }

    @GetMapping
    public ModelAndView listCustomer(){
        ModelAndView modelAndView = new ModelAndView("../pages/customers/index");
        List<Customer> customers = customerService.list();
        modelAndView.addObject("customers", customers);
        return modelAndView;
    }
}
