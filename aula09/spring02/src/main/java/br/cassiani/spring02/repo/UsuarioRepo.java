package br.cassiani.spring02.repo;

import org.springframework.data.repository.CrudRepository;

import br.cassiani.spring02.model.Usuario;

// CRUD - Create, Read, Update and Delete
public interface UsuarioRepo extends CrudRepository<Usuario, Integer> {
    
}
