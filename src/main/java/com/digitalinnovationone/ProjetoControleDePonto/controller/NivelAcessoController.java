package com.digitalinnovationone.ProjetoControleDePonto.controller;

import com.digitalinnovationone.ProjetoControleDePonto.model.NivelAcesso;
import com.digitalinnovationone.ProjetoControleDePonto.service.NivelAcessoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/nivelAcesso")
public class NivelAcessoController {

    @Autowired
    NivelAcessoService nivelAcessoService;

    @PostMapping
    public NivelAcesso createNivelAcesso(@RequestBody NivelAcesso nivelAcesso) {
        return nivelAcessoService.saveNivelAcesso(nivelAcesso);
    }

    @GetMapping
    public List<NivelAcesso> getNivelAcessoList() {
        return nivelAcessoService.findAll();
    }

    @GetMapping("/{idNivelAcesso}")
    public ResponseEntity<NivelAcesso> getNivelAcessoByID(@PathVariable("idNivelAcesso") Long idNivelAcesso) throws Exception {
        return ResponseEntity.ok(nivelAcessoService.getById(idNivelAcesso).orElseThrow(()-> new NoSuchElementException("Not found!")));
    }

    @PutMapping
    public NivelAcesso updateNivelAcesso(@RequestBody NivelAcesso nivelAcesso) {
        return nivelAcessoService.updateNivelAcesso(nivelAcesso);
    }

    @DeleteMapping("/{idNivelAcesso}")
    public ResponseEntity<NivelAcesso> deleteByID(@PathVariable("idNivelAcessp") Long idNivelAcesso) throws Exception {
        try {
            nivelAcessoService.deleteNivelAcesso(idNivelAcesso);
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return (ResponseEntity<NivelAcesso>) ResponseEntity.ok();
    }
}

