package br.com.kumabe.profin.services;

import br.com.kumabe.profin.models.Address;

import java.util.List;

public interface AddressService {
    void create(Address address);
    Address retrieve(Long id);
    void update(Long id, Address address);
    void delete(Long id);
    List<Address> list();
}
