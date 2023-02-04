package com.sip.edinfo.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	@PostMapping("/result")
	@ResponseBody //crée une page web pour afficher "ok"
	public String resultat(@RequestParam("nom")String n,@RequestParam("email")String e) {
	return "Vous avez taper un nom : "+n +" un email: "+e;	
	}
	
	@RequestMapping("/info")// ce que je tape dans l'url
	public String info(Model model) {
		String formation ="Fullstack";
		
		ArrayList <String> names = new ArrayList<>();
		names.add("OCP");
		names.add("Spring");
		names.add("angular");
		System.out.println("Méthode info");
		
		model.addAttribute("workshop",formation);
		model.addAttribute("names",names);//envoyer à view on va passer par model
   return "home/info";//le nom de la vue sous template /home 
	}
@RequestMapping("/affichage")
public String affiche() {
	System.out.println("Méthode affichage");
	return "home/affichage";
}
}
