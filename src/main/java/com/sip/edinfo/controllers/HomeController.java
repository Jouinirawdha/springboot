package com.sip.edinfo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/info")// ce que je tape dans l'url
	public String info(Model model) {
		String formation ="Fullstack";
		System.out.println("Méthode info");
		model.addAttribute("workshop",formation);
   return "home/info";//le nom de la vue sous template /home 
	}
@RequestMapping("/affichage")
public String affiche() {
	System.out.println("Méthode affichage");
	return "home/affichage";
}
}
