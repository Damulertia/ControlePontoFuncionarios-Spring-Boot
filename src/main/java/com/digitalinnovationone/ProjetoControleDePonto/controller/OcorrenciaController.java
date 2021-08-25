package com.digitalinnovationone.ProjetoControleDePonto.controller;


import com.digitalinnovationone.ProjetoControleDePonto.model.Ocorrencia;
import com.digitalinnovationone.ProjetoControleDePonto.service.OcorrenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/ocorrencia")
public class OcorrenciaController {

    @Autowired
    OcorrenciaService ocorrenciaService;

    @PostMapping
    public Ocorrencia createOcorrencia(@RequestBody Ocorrencia ocorrencia) {
        return ocorrenciaService.saveOcorrencia(ocorrencia);
    }

    @GetMapping
    public List<Ocorrencia> getOcorrenciaList() {
        return ocorrenciaService.findAll();
    }

    @GetMapping("/{idOcorrencia}")
    public ResponseEntity<Ocorrencia> getOcorrenciaByID(@PathVariable("idOcorrencia") Long idOcorrencia) throws  Exception {
        return ResponseEntity.ok(ocorrenciaService.getById(idOcorrencia).orElseThrow(()-> new NoSuchElementException("Not found")));
    }

    @PutMapping
    public Ocorrencia updateOcorrencia(@RequestBody Ocorrencia ocorrencia) {
        return ocorrenciaService.updateOcorrencia(ocorrencia);
    }

    @DeleteMapping("/{idOcorrencia}")
    public ResponseEntity<Ocorrencia> deleByID(@PathVariable("idOcorrencia") Long idOcorrencia) throws Exception {
        try {
            ocorrenciaService.deleteOcorrencia(idOcorrencia);
        }catch (Exception e) {
            e.getMessage();
        }
        return (ResponseEntity<Ocorrencia>) ResponseEntity.ok();
    }
}
