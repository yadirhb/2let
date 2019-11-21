package edu.mum.cs.waa.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomeController {

	@RequestMapping({ "/", "/welcome" })
	public String welcome(Model model, Authentication authentication) {

		model.addAttribute("greeting", "Welcome to the Lone Ranger Company, Kimosabe!!");
		model.addAttribute("tagline", "The one and only place to work, so you can live and play!!");

		if (authentication != null) {
			for(GrantedAuthority grant: authentication.getAuthorities()) {
				if (grant.getAuthority().equals("ROLE_ADMIN"))
					return "redirect:users";
			}
		}
		return "welcome";
	}

	@RequestMapping({"item"})
	public String item(Model model) {
		return "pages/item";
	}

	@RequestMapping(value = "/pages/clients")
	public String clients(Model model) {
		return "pages/clients";
	}

	@RequestMapping(value = "users")
	public String users(Model model) {
		return "users/list";
	}

}
