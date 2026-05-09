/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.sistemanotificacao.teste;
import br.edu.etec.sistemanotificacao.model.*;

public class Teste {
    public static void main(String[] args) {
        Notificacao[] notificacoes = new Notificacao[] {
                new Email("joao@email.com", "Bem-vindo ao sistema!"),
                new SMS("11999999999", "Essa e uma mensagem SMS muito longa que pode ultrapassar o limite de 160 caracteres dependendo do conteudo. " + "Vamos testar o truncamento automatico da mensagem.")};
        for (Notificacao n : notificacoes) {
            n.preparar();
            n.enviar();
            System.out.println("----------------------");
        }
    }
}