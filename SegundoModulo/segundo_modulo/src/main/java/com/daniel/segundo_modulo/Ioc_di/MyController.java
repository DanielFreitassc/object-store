package com.daniel.segundo_modulo.Ioc_di;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("my-component")
@RequiredArgsConstructor
public class MyController {
    private final MyComponent myComponent;
    @GetMapping
    public String requestMyComponent() {
        return myComponent.requestByComponent();
    }
    
}
