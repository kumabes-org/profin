package br.com.kumabe.profin.services;

import br.com.kumabe.profin.models.Role;
import br.com.kumabe.profin.models.Vendor;

import java.util.List;

public interface RoleService {
    void create(Role role);
    Role retrieve(Long id);
    void update(Long id, Role role);
    void delete(Long id);
    List<Role> list();
}
