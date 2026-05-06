package com.mani.demo.service;

import com.mani.demo.model.Users;
import com.mani.demo.repository.UserRepository;
import org.apache.catalina.User;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class UserService {
    private final UserRepository repo;
    public UserService(UserRepository repo) {
        this.repo = repo;
    }
    public Users createUser(Users user) {
        return repo.save(user);
    }
    public List<Users> getAllUsers() {
        return repo.findAll();
    }
    public void deleteUser(Long id) {
        repo.deleteById(id);
    }
}
