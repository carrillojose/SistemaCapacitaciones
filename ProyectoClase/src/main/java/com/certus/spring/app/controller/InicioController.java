package com.certus.spring.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.certus.spring.app.models.Curso;
import com.certus.spring.app.models.PageGeneric;

@Controller
@RequestMapping("/certus")
public class InicioController {
	

	@GetMapping({"/inicio", "/home"})
	public String inicio(Model model) {
		
		//instanciar a la clase: pageGeneric		
		PageGeneric pagina = new PageGeneric();
		
		pagina.setTitlePage("App Capacitaciones");
		pagina.setTitle("Mi primera aplicacion con Spring Boot");
		pagina.setMessage("Bienvenidos todos :D !!!");
		pagina.setFooter("Pie de pagina");
		
		//Crear un curso 		
		Curso _curso = new Curso();
		_curso.setNombreCurso("Implementacion Web 2024");
		_curso.setDuracion(96);
		_curso.setCalificacion(20.0);
		
		ArrayList<String> listaTemas = new ArrayList<String>();
		listaTemas.add("Spring Framework");
		listaTemas.add("Spring Boot");
		listaTemas.add("Spring Scurity");
		
		_curso.setTemas(listaTemas);	
		
		model.addAttribute("item", pagina);
		model.addAttribute("curso", _curso);
		
		return "inicio";
	}
	
}
