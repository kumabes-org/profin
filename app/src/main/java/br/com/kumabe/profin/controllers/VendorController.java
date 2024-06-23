package br.com.kumabe.profin.controllers;

import br.com.kumabe.profin.models.User;
import br.com.kumabe.profin.models.Vendor;
import br.com.kumabe.profin.services.UserService;
import br.com.kumabe.profin.services.VendorService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("vendors")
public class VendorController {
    private static final Logger LOGGER = LoggerFactory.getLogger(VendorController.class);
    private final VendorService vendorService;

    @Autowired
    public VendorController(VendorService vendorService){
        this.vendorService = vendorService;
    }


    @GetMapping
    public ModelAndView listVendor(){
        ModelAndView modelAndView = new ModelAndView("../pages/vendors/index");
        List<Vendor> vendors = vendorService.list();
        modelAndView.addObject("vendors", vendors);
        return modelAndView;
    }
}
