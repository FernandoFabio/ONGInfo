package com.example.danco.onginfo.Entidades;

import com.example.danco.onginfo.DAO.ConfiguracaoFirebase;
import com.google.firebase.database.DatabaseReference;

import java.util.HashMap;
import java.util.Map;

public class Pessoa {
    private String id;
    private String email;
    private String senha;
    private String nome;

    public Pessoa() {
    }

    public void salvar(){
        DatabaseReference referenciaFirebase = ConfiguracaoFirebase.getFirebase();
        referenciaFirebase.child("pessoa").child(String.valueOf(getId())).setValue(this);
    }

    public Map<String, Object> toMap(){
        HashMap<String, Object> hashMapPessoa = new HashMap<>();

        hashMapPessoa.put("id", getId());
        hashMapPessoa.put("email", getEmail());
        hashMapPessoa.put("senha", getSenha());
        hashMapPessoa.put("nome", getNome());

        return hashMapPessoa;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
