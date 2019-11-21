package edu.mum.cs.waa.service.impl;

import edu.mum.cs.waa.domain.User;
import edu.mum.cs.waa.repository.UserRepository;
import edu.mum.cs.waa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository repository;

    @Override
    public List<User> getUsers() {
        List<User> users = new ArrayList<>();
        Iterable<User> i = repository.findAll();
        for(User u:i)
            users.add(u);

        return users;
    }

    @Override
    public User getUserByEmail(String email) {
        return repository.findUserByEmail(email);
    }
}
