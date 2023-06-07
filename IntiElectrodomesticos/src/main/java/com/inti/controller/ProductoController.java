package com.inti.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductoController {
	
	@GetMapping("/mantenimientoProducto")
	public String pagProducto() {
		return "mantenimientoProducto";
	}
	
	@GetMapping("/inicio")
	public String pagInicio() {
		return "index";
	}
}