package br.com.kumabe.profin.services;

import br.com.kumabe.profin.models.User;

import java.util.List;

public interface UserService {
    void create(User user);
    User retrieve(Long id);
    void update(Long id, User user);
    void delete(Long id);
    List<User> list();
    User login(String username, String password);
}
