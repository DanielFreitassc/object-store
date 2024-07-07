package com.daniel.segundo_modulo.Controllers;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class SecondModuleContoller {

    @GetMapping("/soma/{num1}/{num2}")
    public double PathParms(@PathVariable double num1, @PathVariable double num2) {
        return num1 + num2;
    }
    
    @GetMapping("/soma")
    public double queryParams(@RequestParam double num1, @RequestParam double num2) {
        return num1 + num2;
    }

    @GetMapping("/header-soma") 
    public double headersParams(@RequestHeader double num1, @RequestHeader double num2) {
        return num1 + num2;
    }
    
    @GetMapping("/query-dinamica")
    public String queryDinamica(@RequestParam Map<String, String> parms) {
        return "Paramametros: " + parms.entrySet();
    }
    
}   
