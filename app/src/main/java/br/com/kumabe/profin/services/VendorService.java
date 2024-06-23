package br.com.kumabe.profin.services;

import br.com.kumabe.profin.models.User;
import br.com.kumabe.profin.models.Vendor;

import java.util.List;

public interface VendorService {
    void create(Vendor vendor);
    Vendor retrieve(Long id);
    void update(Long id, Vendor vendor);
    void delete(Long id);
    List<Vendor> list();
}
