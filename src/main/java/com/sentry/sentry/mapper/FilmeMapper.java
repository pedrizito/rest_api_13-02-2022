package com.sentry.sentry.mapper;

import com.sentry.sentry.model.Filme;
import com.sentry.sentry.model.dto.FilmeDTO;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class FilmeMapper {
    public Filme toEntity(FilmeDTO dto) {
        Filme filme = new Filme();
        filme.setId(dto.getId());
        filme.setName(dto.getName());
        filme.setDescription(dto.getDecription());
        filme.setDate(dto.getPostDate());
        return filme;
    }

    public FilmeDTO toDto(Filme filme) {
        FilmeDTO dto = new FilmeDTO();
        dto.setId(filme.getId());
        dto.setName(filme.getName());
        dto.setPostDate(filme.getDate());
        dto.setDecription(filme.getDescription());
        return dto;
    }

    public List<FilmeDTO> toDto(List<Filme> filmes) {
        return filmes.stream().map(this::toDto).collect(Collectors.toList());
    }
}
