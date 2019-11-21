package edu.mum.cs.waa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping({ "/", "/welcome" })
	public String welcome(Model model) {

		model.addAttribute("greeting", "Welcome to 2Let, the ultimate recreational experience!!!");
		model.addAttribute("tagline", "The one and only place to enjoy, to live and play!!");


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
