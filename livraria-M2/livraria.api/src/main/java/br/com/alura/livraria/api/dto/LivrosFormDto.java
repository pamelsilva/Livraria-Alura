package br.com.alura.livraria.api.dto;


import java.time.LocalDate;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LivrosFormDto {
	

	@NotBlank
	private String titulo;
	
	@PastOrPresent
	private LocalDate lancamento;
	
	@Min(10)
	private int paginas;
	
	@NotNull
	private String autor;

}
