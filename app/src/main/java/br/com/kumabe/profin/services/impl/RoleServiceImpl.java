package br.com.kumabe.profin.services.impl;

import br.com.kumabe.profin.controllers.AddressController;
import br.com.kumabe.profin.models.Role;
import br.com.kumabe.profin.repositories.RoleRepository;
import br.com.kumabe.profin.services.RoleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("roleService")
public class RoleServiceImpl implements RoleService {
    private static final Logger LOGGER = LoggerFactory.getLogger(RoleServiceImpl.class);

    private final RoleRepository roleRepository;

    @Autowired
    public RoleServiceImpl(RoleRepository roleRepository){
        this.roleRepository = roleRepository;
    }
    @Override
    public void create(Role role) {

    }

    @Override
    public Role retrieve(Long id) {
        return null;
    }

    @Override
    public void update(Long id, Role role) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<Role> list() {
        return roleRepository.findAll();
    }
}
