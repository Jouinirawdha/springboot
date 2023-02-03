package com.sip.edinfo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/info")// ce que je tape dans l'url
	public String info() {
		System.out.println("Méthode info");
   return "home/info";//le nom de la vue sous template /home 
	}
@RequestMapping("/affichage")
public String affiche() {
	return "home/affichage";
}
}
