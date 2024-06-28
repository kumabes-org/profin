package br.com.kumabe.profin.services.impl;

import br.com.kumabe.profin.controllers.AddressController;
import br.com.kumabe.profin.models.Vendor;
import br.com.kumabe.profin.repositories.VendorRepository;
import br.com.kumabe.profin.services.VendorService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("vendorService")
public class VendorServiceImpl implements VendorService {
    private static final Logger LOGGER = LoggerFactory.getLogger(VendorServiceImpl.class);
    private final VendorRepository vendorRepository;
    @Autowired
    public VendorServiceImpl(VendorRepository vendorRepository){
        this.vendorRepository = vendorRepository;
    }
    @Override
    public void create(Vendor vendor) {

    }

    @Override
    public Vendor retrieve(Long id) {
        return null;
    }

    @Override
    public void update(Long id, Vendor vendor) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<Vendor> list() {
        return vendorRepository.findAll();
    }
}
