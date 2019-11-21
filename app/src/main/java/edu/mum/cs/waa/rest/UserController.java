package edu.mum.cs.waa.rest;

import edu.mum.cs.waa.domain.User;
import edu.mum.cs.waa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/v1/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping(value = "/user/email/{email:.+}", produces = "application/json; charset=UTF-8")
    public @ResponseBody
    User getUserByEmail(@PathVariable("email") String email) {
        return userService.getUserByEmail(email);
    }

    @GetMapping(value = "/user/username/{username}")
    public @ResponseBody
    User getUserByUsername(@PathVariable("username") String username) {
        return userService.getUserByUsername(username);
    }
}
