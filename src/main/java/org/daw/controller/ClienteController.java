package org.daw.controller;

import java.util.List;

import org.daw.interfaceService.IClienteService;
import org.daw.modelo.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class ClienteController {
	
	@Autowired
	private IClienteService servicio;
	
	// List
	@GetMapping("/listar")		// localhost:8080/listar
	public String Listar(Model model) {
		
		List<Cliente> lista = servicio.Listado();
		model.addAttribute("clients", lista);
		
		return "listar";
	}
	
	
	// Add
	@GetMapping("/nuevo")
	public String Agregar(Model model) {
		
		model.addAttribute("client", new Cliente());
		
		return "form";
	}
	
	// Save
	@GetMapping("/grabar")
	public String Grabar(@Validated Cliente c, Model model) {
		
		servicio.Grabar(c);
		
		return "redirect:/listar";
	}
}
