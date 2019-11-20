package edu.mum.cs.waa.controller;

import edu.mum.cs.waa.domain.Credentials;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(@ModelAttribute("credentials") Credentials credentials) {
		return "login";
	}

	@RequestMapping(value = "/loginfailed", method = RequestMethod.GET)
	public String loginerror(Model model) {
		model.addAttribute("error", "true");
		return "login";

	}

	@RequestMapping(value = "/postlogin", method = RequestMethod.POST)
	public String loginPost(@ModelAttribute("credentials") Credentials credentials) {
		System.out.println("Login here ... ");
		return "login";
	}

	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(Model model) {
		return "redirect:/welcome";
	}
}
