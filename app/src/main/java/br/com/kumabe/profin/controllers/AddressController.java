package br.com.kumabe.profin.controllers;

import br.com.kumabe.profin.models.Address;
import br.com.kumabe.profin.models.User;
import br.com.kumabe.profin.repositories.AddressRepository;
import br.com.kumabe.profin.services.AddressService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("addresses")
public class AddressController {
    private static final Logger LOGGER = LoggerFactory.getLogger(AddressController.class);

    private final AddressService addressService;

    @Autowired
    public AddressController(AddressService addressService){
        this.addressService = addressService;
    }


    @GetMapping
    public ModelAndView listAddress(){
        ModelAndView modelAndView = new ModelAndView("../pages/addresses/index");
        List<Address> addresses = addressService.list();
        modelAndView.addObject("addresses", addresses);
        return modelAndView;
    }


    @PostMapping
    public ModelAndView createAddress(@ModelAttribute Address address) {
        LOGGER.info("Address: {}", address);
        addressService.create(address);
        ModelAndView modelAndView = new ModelAndView("redirect:/addresses");
        return modelAndView;
    }

    @GetMapping("/new")
    public ModelAndView newAddress(){
        ModelAndView modelAndView = new ModelAndView("../pages/addresses/new");
        Address address = new Address();
        modelAndView.addObject("address", address);
        return modelAndView;
    }
}
