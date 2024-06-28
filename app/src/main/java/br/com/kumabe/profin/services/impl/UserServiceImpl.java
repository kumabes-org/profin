package br.com.kumabe.profin.services.impl;

import br.com.kumabe.profin.controllers.AddressController;
import br.com.kumabe.profin.models.User;
import br.com.kumabe.profin.repositories.UserRepository;
import br.com.kumabe.profin.services.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);
    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }
    @Override
    public void create(User user) {
        userRepository.saveAndFlush(user);
    }

    @Override
    public User retrieve(Long id) {
        return null;
    }

    @Override
    public void update(Long id, User user) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<User> list() {
        return userRepository.findAll();
    }

    @Override
    public User login(String username, String password) {
        return null;
    }
}
