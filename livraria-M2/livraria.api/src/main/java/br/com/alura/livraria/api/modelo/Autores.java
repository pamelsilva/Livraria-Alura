package br.com.alura.livraria.api.modelo;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(exclude = {"nascimento","curriculo","email"})
@AllArgsConstructor
@NoArgsConstructor

public class Autores {

	private String nome;
	private String email;
	private LocalDate nascimento;
	private String curriculo;

}




