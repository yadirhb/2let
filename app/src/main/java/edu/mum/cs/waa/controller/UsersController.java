package edu.mum.cs.waa.controller;

import edu.mum.cs.waa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("/users")
@PreAuthorize("hasRole('ROLE_ADMIN')")
public class UsersController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "list")
    public String list(Model model){
        model.addAttribute("users",userService.getUsers());
        return "list";
    }

}
