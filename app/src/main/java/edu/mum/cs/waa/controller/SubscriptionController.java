package edu.mum.cs.waa.controller;

import edu.mum.cs.waa.domain.Client;
import edu.mum.cs.waa.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/subscription")
public class SubscriptionController {

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String joinPage() {
        return "subscription/join";
    }

    @RequestMapping(value = "/joinForm", method = RequestMethod.GET)
    public String joinForm(@ModelAttribute("newMember") User user) {
        return "subscription/form";
    }
}
