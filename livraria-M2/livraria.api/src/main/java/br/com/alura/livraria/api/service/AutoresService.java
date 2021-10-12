package br.com.alura.livraria.api.service;

import br.com.alura.livraria.api.dto.AutoresDto;
import br.com.alura.livraria.api.dto.AutoresFormDto;
import br.com.alura.livraria.api.modelo.Autores;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class AutoresService {

    private List<Autores> autores = new ArrayList<>();
    ModelMapper modelMapper = new ModelMapper();

    public List<AutoresDto> listar() {
        return autores.stream().map(a -> modelMapper.map(a, AutoresDto.class)).collect(Collectors.toList());
    }

    public void cadastrar(@Valid AutoresFormDto dto) {
        Autores autor = modelMapper.map(dto, Autores.class);
        autores.add(autor);
    }

}
