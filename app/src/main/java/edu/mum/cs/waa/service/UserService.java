package edu.mum.cs.waa.service;

import edu.mum.cs.waa.domain.User;

import java.util.List;

public interface UserService {
    List<User> getUsers();

    User getUserByEmail(String email);
}
