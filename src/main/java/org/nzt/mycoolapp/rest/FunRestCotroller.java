package org.nzt.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestCotroller {

    @GetMapping("/")
    public String holamundo() {
        return  "Hello World";
    }
}
