package com.soa.ws.RestWs;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SayHello {

    @RequestMapping("/Hola")
    public String sayhello() {
        return("Hola Mundo");
    }
}
