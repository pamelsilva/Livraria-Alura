package br.com.alura.livraria.api.service;

import br.com.alura.livraria.api.dto.LivrosDto;
import br.com.alura.livraria.api.dto.LivrosFormDto;
import br.com.alura.livraria.api.modelo.Livros;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class LivrosService {
    
    private List<Livros> livros = new ArrayList<>();
    ModelMapper modelMapper = new ModelMapper();
    
    public List<LivrosDto> listar() {
        return livros.stream().map(l -> modelMapper.map(l, LivrosDto.class)).collect(Collectors.toList());
    }
    
    public void cadastrar(@Valid LivrosFormDto dto) {
        Livros livro = modelMapper.map(dto, Livros.class);
        livros.add(livro);
    }
    
}
