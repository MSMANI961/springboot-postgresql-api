package com.mani.demo.controller;
import com.mani.demo.model.Users;
import com.mani.demo.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/users")
public class UserController {
    private final UserService service;
    public UserController(UserService service) {
        this.service = service;
    }
    @PostMapping
    public Users create(@RequestBody Users user) {
        return service.createUser(user);
    }
    @GetMapping
    public List<Users> getAll() {
        return service.getAllUsers();
    }
    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        service.deleteUser(id);
        return "Deleted successfully";
    }
}