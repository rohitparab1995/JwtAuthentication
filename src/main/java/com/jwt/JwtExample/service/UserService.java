package com.jwt.JwtExample.service;

import com.jwt.JwtExample.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {
    private List<User> store = new ArrayList<>();

    public UserService() {
        store.add(new User(UUID.randomUUID().toString(), "Rohit1", "rparab1@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(), "Rohit2", "rparab2@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(), "Rohit3", "rparab3@gmail.com"));
    }

    public List<User> getUsers(){
        return this.store;
    }
}
