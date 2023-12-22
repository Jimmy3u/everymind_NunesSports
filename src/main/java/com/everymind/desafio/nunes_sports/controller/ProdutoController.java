package com.everymind.desafio.nunes_sports.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

@Controller
public class ProdutoController {

    @GetMapping("/produto")
    public void returnProducts(){
        System.out.println("sim");
    }
    
    @GetMapping("/produto/{id}")
    public void returnProductById(){
        // Todo : implemnt get by id
    }

    @PostMapping("/produto")
    public void saveProduct(){
        //TODO : Implement post
    }

    @PutMapping("/produto/{id}")
    public void alterProduct(){
        //TODO : Implement update
    }

    @DeleteMapping("/produto/{id}")
    public void deleteProduct(){
        //TODO : Implement delete
    }

}
