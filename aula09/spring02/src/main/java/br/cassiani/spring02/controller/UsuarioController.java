package br.cassiani.spring02.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
    public ResponseEntity<Usuario> getUser(@PathVariable int id) {
        Usuario userEncontrado = repo.findById(id).orElse(null);

        if (userEncontrado != null) {
            return ResponseEntity.ok(userEncontrado);
        }

        return ResponseEntity.notFound().build();
    }

    @GetMapping("/all")
    public List<Usuario> getAllUsers() {
        List<Usuario> list = (List<Usuario>) repo.findAll();
        return list;
    }

    @PostMapping("/login")
    public ResponseEntity<Usuario> login(@RequestBody Usuario userParam) {
        Usuario userEncontrado = repo.findByEmailAndSenha(userParam.getEmail(), userParam.getSenha());
        
        if (userEncontrado != null) {
            return ResponseEntity.ok(userEncontrado);
        }

        return ResponseEntity.notFound().build();
    }
}
