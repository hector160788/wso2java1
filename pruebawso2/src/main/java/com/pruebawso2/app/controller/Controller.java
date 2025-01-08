package com.pruebawso2.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@GetMapping(path = "/prueba")
	public String saludo() {
		return "hola";
	}

}
