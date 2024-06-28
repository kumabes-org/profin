package br.com.kumabe.profin.services.impl;

import br.com.kumabe.profin.controllers.AddressController;
import br.com.kumabe.profin.models.Address;
import br.com.kumabe.profin.repositories.AddressRepository;
import br.com.kumabe.profin.services.AddressService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("addressService")
public class AddressServiceImpl implements AddressService {
    private static final Logger LOGGER = LoggerFactory.getLogger(AddressServiceImpl.class);
    private final AddressRepository addressRepository;
    @Autowired
    public AddressServiceImpl(AddressRepository addressRepository){
        this.addressRepository = addressRepository;
    }
    @Override
    public void create(Address address) {
        addressRepository.saveAndFlush(address);
    }

    @Override
    public Address retrieve(Long id) {
        return null;
    }

    @Override
    public void update(Long id, Address address) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<Address> list() {
        return addressRepository.findAll();
    }
}
