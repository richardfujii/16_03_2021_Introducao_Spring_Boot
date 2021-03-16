package br.com.habilidades.BSM.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/BSM")
public class bsmController {
	
	@GetMapping
	public String bsm() {
		return "Atenção aos detalhes e Persistência";	
	}
}
