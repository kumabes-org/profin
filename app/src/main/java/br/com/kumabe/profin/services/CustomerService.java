package br.com.kumabe.profin.services;

import br.com.kumabe.profin.models.Customer;
import br.com.kumabe.profin.models.Vendor;

import java.util.List;

public interface CustomerService {
    void create(Customer customer);
    Customer retrieve(Long id);
    void update(Long id, Customer customer);
    void delete(Long id);
    List<Customer> list();
}
