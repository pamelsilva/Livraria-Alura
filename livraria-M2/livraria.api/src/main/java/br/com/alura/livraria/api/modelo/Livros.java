package br.com.alura.livraria.api.modelo;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Livros {
	
	private String titulo;
	private LocalDate dataLancamento;
	private int paginas;
	private String autor;
}
