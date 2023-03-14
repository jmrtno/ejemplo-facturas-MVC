package com.bolsadeideas.springboot.di.app.models.service;

//@Component // o @Service
//public class MiServicio {
//	
//	public String operacion() {
//		return "ejecutando cosas importantes...";
//	}
//}

// <---- IMPLEMENTANDO LA INTERFAZ ---->
public class MiServicioComplejo implements IServicio {
	
	@Override
	public String operacion() {
		return "ejecutando cosas importantes complejas...";
	}
	
}
