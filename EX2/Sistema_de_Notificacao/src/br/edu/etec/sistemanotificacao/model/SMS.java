/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.sistemanotificacao.model;

public class SMS extends Notificacao {
    public SMS(String destinatario, String mensagem) {
        super(destinatario, mensagem, TipoNotificacao.SMS);
    }
    @Override
    public void enviar() {
        String msgFinal = mensagem;
        if (msgFinal.length() > 160) {
            msgFinal = msgFinal.substring(0, 160);
        }
        System.out.println("Enviando SMS para " + destinatario);
        System.out.println("Mensagem: " + msgFinal);
    }
}