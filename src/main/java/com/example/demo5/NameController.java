package com.example.demo5;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")

public class NameController {

    @GetMapping("/name")

    @CrossOrigin(origins = {"http://localhost:7777"}, methods = {RequestMethod.GET, RequestMethod.POST})

    @Operation(summary = "Restituisce stringa inserita")

    public String name(@RequestParam String name){
        return name.toString();
    }

    @PostMapping("/name-change")

    @Operation(summary = "Restituisce stringa inserita al contrario")

    public String nameChange(@RequestParam String name){
        return new StringBuilder(name).reverse().toString();
    }
}
