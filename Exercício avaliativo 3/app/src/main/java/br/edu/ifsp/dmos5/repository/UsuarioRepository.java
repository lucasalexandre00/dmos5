package br.edu.ifsp.dmos5.repository;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifsp.dmos5.model.Usuario;

public class UsuarioRepository{

    private static List<Usuario> listaUsuarios = new ArrayList<Usuario>();

    public void save(String username, String password){
        listaUsuarios.add(new Usuario(username, password));
    }

    public List<Usuario> findAll(){
        return this.listaUsuarios;
    }
}
