package br.com.kumabe.profin.services.impl;

import br.com.kumabe.profin.controllers.AddressController;
import br.com.kumabe.profin.models.Customer;
import br.com.kumabe.profin.repositories.CustomerRepository;
import br.com.kumabe.profin.services.CustomerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {
    private static final Logger LOGGER = LoggerFactory.getLogger(CustomerServiceImpl.class);

    private final CustomerRepository customerRepository;
    @Autowired
    public CustomerServiceImpl(CustomerRepository customerRepository){
        this.customerRepository = customerRepository;
    }
    @Override
    public void create(Customer customer) {

    }

    @Override
    public Customer retrieve(Long id) {
        return null;
    }

    @Override
    public void update(Long id, Customer customer) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<Customer> list() {
        return customerRepository.findAll();
    }
}
