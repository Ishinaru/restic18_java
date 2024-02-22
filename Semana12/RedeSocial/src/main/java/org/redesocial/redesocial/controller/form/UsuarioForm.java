package org.redesocial.redesocial.controller.form;

import org.redesocial.redesocial.modelo.Usuario;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class UsuarioForm {
    private String Nome;
    private String Email;
    private String Senha;

    public UsuarioForm() {
    }

    public UsuarioForm(String nome, String email, String senha) {
        Nome = nome;
        Email = email;
        Senha = senha;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String senha) {
        Senha = senha;
    }

    public Usuario criarUsuario(){
        return new Usuario( Nome, Email, Senha);
    }

}
