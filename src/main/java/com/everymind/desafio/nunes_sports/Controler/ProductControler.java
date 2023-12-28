package com.everymind.desafio.nunes_sports.Controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductControler {

    @RequestMapping(value = "/")
    public String index(){
        return "index";
    }
}
