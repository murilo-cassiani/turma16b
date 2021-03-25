package br.cassiani.spring01.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sample")
public class HelloController {

    @GetMapping("/hello")
    public ResponseEntity<String> ola() {
        return ResponseEntity.ok("Olá mundo!"); // ok = 200
        // return ResponseEntity.notFound().build(); // notFound = 404
    }

    @PostMapping("/hello")
    public String olaPost() {
        return "Olá mundo via Post!";
    }

    @GetMapping("/positivo/{numero}")
    public ResponseEntity<String> isPositive(@PathVariable int numero) {
        if (numero > 0) {
            return ResponseEntity.ok("É positivo");
        }

        return ResponseEntity.ok("Não é positivo");
    }
}
