package br.cassiani.spring02.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.cassiani.spring02.model.Usuario;
import br.cassiani.spring02.repo.UsuarioRepo;

@RestController
@CrossOrigin("*") // aceita requisições de qualquer domínio
@RequestMapping("/user")
public class UsuarioController {
    @Autowired // injeção de dependência
    private UsuarioRepo repo;

    @GetMapping("/id/{id}")
    public Usuario getUser(@PathVariable int id) {
        Usuario userEncontrado = repo.findById(id).orElse(null);
        return userEncontrado;
    }
}
