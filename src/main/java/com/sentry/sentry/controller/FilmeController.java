package com.sentry.sentry.controller;

import com.sentry.sentry.model.dto.FilmeDTO;
import com.sentry.sentry.service.FilmeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@RestController
@RequestMapping(value = "/filmes")
public class FilmeController {

    @Autowired
    private FilmeService service;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<FilmeDTO> save (@Valid @RequestBody FilmeDTO dto) {
        return ResponseEntity.ok(service.save(dto));
    }

    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<FilmeDTO> update (@Valid @RequestBody FilmeDTO dto) {
        return ResponseEntity.ok(service.update(dto));
    }

    @GetMapping (produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<FilmeDTO>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<FilmeDTO> find(@PathVariable Long id) {
        return ResponseEntity.ok(service.findById(id));
    }

    @DeleteMapping(value = "/delete/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<FilmeDTO> delete(@PathVariable Long id) {
        return ResponseEntity.ok(service.delete(id));
    }
}
