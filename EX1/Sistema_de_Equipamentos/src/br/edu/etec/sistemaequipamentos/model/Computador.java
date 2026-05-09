/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.sistemaequipamentos.model;

public class Computador extends Equipamento {
    private String processador;
    public Computador(String nome, String modelo, String processador) {
        super(nome, modelo);
        this.processador = processador;
    }
    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Processador: " + processador);
    }
}