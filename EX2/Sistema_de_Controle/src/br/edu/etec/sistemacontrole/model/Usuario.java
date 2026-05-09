/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.sistemacontrole.model;

public class Usuario {
    private String login;
    private String senha;
    private NivelAcesso nivel;
    private boolean ativo;

    public Usuario(String login, String senha, NivelAcesso nivel, boolean ativo) {
        this.login = login;
        this.senha = senha;
        this.nivel = nivel;
        this.ativo = ativo;
    }
    public boolean autenticar(String senha) {

        return this.ativo && this.senha.equals(senha);
    }
    public void desativar() {
        this.ativo = false;
    }
    public NivelAcesso getNivel() {
        return nivel;
    }
    public String getLogin() {
        return login;
    }
}