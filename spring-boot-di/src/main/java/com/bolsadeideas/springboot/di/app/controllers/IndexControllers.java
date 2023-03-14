package com.bolsadeideas.springboot.di.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.bolsadeideas.springboot.di.app.models.service.IServicio;
// import com.bolsadeideas.springboot.di.app.models.service.MiServicio;



@Controller
public class IndexControllers {
	
	// <---- MEDIANTE INYECCION DIRECTA ---->
	// private MiServicio servicio = new MiServicio();
	
	// <---- MEDIANTE INYECCION DE DEPENDENCIAS CON PRINCIPIO HOLLYWOOD: ---->
	// @Autowired
	// private MiServicio servicio;
	
	// <---- MEDIANTE INYECCION DE INTERFACES (creando iterfaz previamente) (desacoplamiento)---->
	@Autowired
	private IServicio servicio;

	@GetMapping({"/", "", "/index"})
	public String index(Model model) {
		
		model.addAttribute("objeto", servicio.operacion());
		return "index";
	}

	
	
}
