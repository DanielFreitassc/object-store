package com.daniel.segundo_modulo.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class SecondModuleContoller {

    @GetMapping("/{num1}/{num2}")
    public double PathParms(@PathVariable double num1, @PathVariable double num2) {
        return num1 + num2;
    }
    
}
