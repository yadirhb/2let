package edu.mum.cs.waa.controller;

import edu.mum.cs.waa.domain.SubscriptionType;
import edu.mum.cs.waa.domain.User;
import edu.mum.cs.waa.service.SubscriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/subscription")
public class SubscriptionController {

    @Autowired
    private SubscriptionService service;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String joinPage(Model model) {
        model.addAttribute("memberships", service.getMembershipTypes());
        return "subscription/join";
    }

    @RequestMapping(value = "/join", method = RequestMethod.GET)
    public String joinForm(@ModelAttribute("newMember") User user, @RequestAttribute("type") SubscriptionType type) {
        return "subscription/form";
    }
}
