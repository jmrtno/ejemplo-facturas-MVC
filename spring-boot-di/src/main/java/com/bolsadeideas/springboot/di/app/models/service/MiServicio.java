package com.bolsadeideas.springboot.di.app.models.service;

// import org.springframework.stereotype.Service;

//@Component // o @Service
//public class MiServicio {
//	
//	public String operacion() {
//		return "ejecutando cosas importantes...";
//	}
//}

// <---- IMPLEMENTANDO LA INTERFAZ ---->
public class MiServicio implements IServicio {
	
	@Override
	public String operacion() {
		return "ejecutando cosas importantes simples...";
	}
	
}
