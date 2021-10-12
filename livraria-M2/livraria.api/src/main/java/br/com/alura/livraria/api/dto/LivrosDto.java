package br.com.alura.livraria.api.dto;

import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LivrosDto {
	
	private String titulo;
    private LocalDate lancamento;
    private int paginas;
    private String autor;

}
