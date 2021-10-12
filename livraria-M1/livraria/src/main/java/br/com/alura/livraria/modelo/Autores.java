package br.com.alura.livraria.modelo;

import java.time.LocalDate;

public class Autores {
	private String nome;
	private String email;
	private String curriculo;
	private LocalDate data;
	
public Autores() {
		
	}
		
		
	public Autores(String nome, String email, String curriculo, LocalDate data) {
		super();
		this.nome = nome;
		this.email = email;
		this.curriculo = curriculo;
		this.data = data;
				
	}
	
	
		
	@Override
	public String toString() {
		return "Autores [nome=" + nome + ", email=" + email + ", curriculo=" + curriculo + ", data=" + data + "]";
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCurriculo() {
		return curriculo;
	}
	public void setCurriculo(String curriculo) {
		this.curriculo = curriculo;
	}
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}


}