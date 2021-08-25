package com.digitalinnovationone.ProjetoControleDePonto.controller;

import com.digitalinnovationone.ProjetoControleDePonto.model.CategoriaUsuario;
import com.digitalinnovationone.ProjetoControleDePonto.service.CategoriaUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/categoriaUsuario")
public class CategoriaUsuarioController {

    @Autowired
    CategoriaUsuarioService categoriaUsuarioService;

    @PostMapping
    public CategoriaUsuario createCategoriaUsuario (@RequestBody CategoriaUsuario categoriaUsuario) {
        return categoriaUsuarioService.saveCategoriaUsuario(categoriaUsuario);
    }

    @GetMapping
    public List<CategoriaUsuario> getCategoriaUsuarioList() {
       return categoriaUsuarioService.findAll();
    }

    @GetMapping("/{idCategoriaUsuario}")
    ResponseEntity<CategoriaUsuario> getCategoriaUsuarioByID(@PathVariable("idCategoriaUsuario") Long idCategoriaUsuario) throws Exception {
        return ResponseEntity.ok(categoriaUsuarioService.getById(idCategoriaUsuario).orElseThrow(()-> new NoSuchElementException("Not found")));
    }

    @PutMapping
    public CategoriaUsuario updateCategoriaUsuario(@RequestBody CategoriaUsuario categoriaUsuario) {
        return categoriaUsuarioService.updateCategoriaUsuario(categoriaUsuario);
    }

    @DeleteMapping("/{idCategoriaUsuario}")
    ResponseEntity<CategoriaUsuario> deleteByID(@PathVariable("idCategoriaUsuario") Long idCategoriaUsuario) throws  Exception {
        try{
            categoriaUsuarioService.deleteCategoriaUsuario(idCategoriaUsuario);
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return  (ResponseEntity<CategoriaUsuario>) ResponseEntity.ok();
    }

}
