package br.com.alura.livraria.api.dto;

import java.time.LocalDate;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.PastOrPresent;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AutoresFormDto {


	@NotBlank
	private String nome;
	@NotBlank
	private String email;

    @PastOrPresent
	private LocalDate dataNascimento;
	@NotBlank
	private String curriculo;
}
	


