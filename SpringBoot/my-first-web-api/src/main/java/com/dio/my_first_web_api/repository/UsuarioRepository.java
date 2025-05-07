package com.dio.my_first_web_api.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.dio.my_first_web_api.model.Usuario;

@Repository
public class UsuarioRepository {

    public void save(Usuario usuario){
        System.out.println("SAVE - Recebendo o usuário na camada de repositório");
        System.out.println(usuario);
    }
    public void update(Usuario usuario){
        System.out.println("UPDATE - Recebendo o usuário na camada de repositório");
        System.out.println(usuario);
    }
    public void remove(Integer id){
        System.out.println(String.format("DELETE/id - Recebendo o id: %d para excluir um usuário", id));
        System.out.println(id);
    }
    public List<Usuario> listAll(){
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("savio","password"));
        usuarios.add(new Usuario("jonas","masterpass"));
        return usuarios;
    }
    public Usuario finById(Integer id){
        System.out.println(String.format("GET/id - Recebendo o id: %d para localizar um usuário", id));
        return new Usuario("savio","password");
    }

}