package com.daniel.segundo_modulo.Ioc_di;

import org.springframework.stereotype.Component;

@Component
public class MyComponent {
    
    public String requestByComponent() {
        return "Response";
    }
}
