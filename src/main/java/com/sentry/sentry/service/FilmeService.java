package com.sentry.sentry.service;

import com.sentry.sentry.exceptions.NotFoundException;
import com.sentry.sentry.mapper.FilmeMapper;
import com.sentry.sentry.model.Filme;
import com.sentry.sentry.model.dto.FilmeDTO;
import com.sentry.sentry.repository.FilmeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class FilmeService {

    @Autowired
    private FilmeRepository repository;

    @Autowired
    private FilmeMapper mapper;

    @Transactional
    public FilmeDTO save(FilmeDTO dto) {
        Filme filme = mapper.toEntity(dto);
        repository.save(filme);
        return mapper.toDto(filme);
    }

    @Transactional
    public FilmeDTO update(FilmeDTO dto) {
        Filme filme = mapper.toEntity(dto);
        repository.save(filme);
        return mapper.toDto(filme);
    }

    @Transactional(readOnly = true)
    public List<FilmeDTO> findAll(){
        return mapper.toDto(repository.findAll());
    }

    @Transactional(readOnly = true)
    public FilmeDTO findById(Long id){
        return repository.findById(id).map(mapper::toDto).orElseThrow(NotFoundException::new);
    }

    @Transactional
    public FilmeDTO delete(Long id){
        FilmeDTO dto = findById(id);
        repository.deleteById(dto.getId());
        return dto;
    }
}
