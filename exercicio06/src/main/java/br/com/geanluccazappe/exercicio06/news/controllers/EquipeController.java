package br.com.geanluccazappe.exercicio06.news.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.geanluccazappe.exercicio06.news.models.EquipeEntity;

@RestController
@RequestMapping("ajuda")
public class EquipeController {
    
    @GetMapping
    public ResponseEntity<Object> equipeInfo() {
        EquipeEntity equipeEntity = new EquipeEntity();
        return ResponseEntity.status(HttpStatus.OK).body(equipeEntity);
    }
}
