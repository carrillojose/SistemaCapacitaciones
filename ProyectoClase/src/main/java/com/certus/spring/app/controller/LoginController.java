package com.certus.spring.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.certus.spring.app.models.Login;

@Controller
@RequestMapping("/Auth")
public class LoginController {
	
	@GetMapping("/Initial")
	public String login(Model model) {	
		
		Login usuario = new Login();
		
		model.addAttribute("user", usuario);
		
		return "login/login";		
	}
	
	@PostMapping
	public String Auth( @RequestParam Login usuario ) {
		
		if (usuario.getUsuario() == "Alumno01") {
			
			if (usuario.getContrasenia() == "aksjdhaksjdhask") {
				return "home";
			}else {
				return "login/login";	
			}	
			
		}else {
			return "register";			
		}
		
	}

}
