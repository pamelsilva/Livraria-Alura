package br.com.alura.livraria.teste;

import br.com.alura.livraria.modelo.Autores;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;


public class Teste {

	public static void main(String[] args) {
		Autores x = new Autores();
		
		 x.setNome("Agatha Christie");
		 x.setEmail("agathachristie@gmail.com.br");
		 x.setCurriculo("Atuou como romancista, contista, dramaturga e poetisa");
         x.setData(LocalDate.now());               
         
         
 	    System.out.println(x.getNome());
 	    System.out.println(x.getEmail());
 	    System.out.println(x.getCurriculo());
 	    System.out.println(x.getData().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
 	    
 	    	  
 	
	}

}
