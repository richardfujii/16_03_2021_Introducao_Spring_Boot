package br.com.objetivos.Metas.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Metas")
public class MetasController {
	@GetMapping
	public String metassemanais() {
		return "Aprender String Boot e Banco de Dados";
	}
}
