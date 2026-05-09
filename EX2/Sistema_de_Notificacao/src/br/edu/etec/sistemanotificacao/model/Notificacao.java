/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.edu.etec.sistemanotificacao.model;

public abstract class Notificacao {
    protected String destinatario;
    protected String mensagem;
    protected TipoNotificacao tipo;

    public Notificacao(String destinatario, String mensagem, TipoNotificacao tipo) {
        this.destinatario = destinatario;
        this.mensagem = mensagem;
        this.tipo = tipo;
    }
    public void preparar() {
        System.out.println("Preparando notificacao para: " + destinatario);
        System.out.println("Tipo: " + tipo);
    }
    public abstract void enviar();
}