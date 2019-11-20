package edu.mum.cs.waa.controller;

import edu.mum.cs.waa.domain.SubscriptionType;
import edu.mum.cs.waa.domain.User;
import edu.mum.cs.waa.service.RoleService;
import edu.mum.cs.waa.service.SubscriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;

@Controller
@RequestMapping(value = "/subscription")
public class SubscriptionController {

    @Autowired
    private SubscriptionService subscriptionService;

    @Autowired
    private RoleService roleService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String joinPage(Model model) {
        model.addAttribute("memberships", subscriptionService.getMembershipTypes());
        return "subscription/join";
    }

    @RequestMapping(value = "/join", method = RequestMethod.GET)
    public String joinForm(Model model, @RequestParam("type") SubscriptionType type) {
        model.addAttribute("newMember", new User(roleService.getRoleByName("CLIENT")));
        model.addAttribute("type", type);
        return "subscription/form";
    }

    @RequestMapping(value = "/join", method = RequestMethod.POST)
    public String requestMembership(@Valid @ModelAttribute("newMember") User user, BindingResult results, @RequestParam("type") SubscriptionType type) {
        if (results.hasErrors()) {
            return "subscription/form";
        }
        return "redirect:/success";
    }
}
