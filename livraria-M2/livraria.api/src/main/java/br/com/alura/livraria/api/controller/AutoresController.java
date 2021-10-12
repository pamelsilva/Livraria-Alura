package br.com.alura.livraria.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.alura.livraria.api.dto.AutoresDto;
import br.com.alura.livraria.api.dto.AutoresFormDto;
import br.com.alura.livraria.api.service.AutoresService;
import java.util.List;
import javax.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;


	
@RestController
@RequestMapping("/autores")
public class AutoresController {

	@Autowired
	private AutoresService service;
	
	@GetMapping
	public List<AutoresDto> listar(){
		return service.listar();
	}
	
	@PostMapping
	public void cadastrar(@RequestBody @Valid AutoresFormDto dto) {
		service.cadastrar(dto);
	}
}

