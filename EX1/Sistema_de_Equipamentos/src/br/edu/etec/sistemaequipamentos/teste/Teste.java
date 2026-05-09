/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.sistemaequipamentos.teste;
import br.edu.etec.sistemaequipamentos.model.Computador;

public class Teste {
    public static void main(String[] args) {
        Computador pc = new Computador("Notebook", "Asus ROG STRIX G16", "Intel Core i9");
        pc.exibirDados();
    }
}