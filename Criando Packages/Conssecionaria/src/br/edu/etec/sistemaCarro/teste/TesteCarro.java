/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.sistemaCarro.teste;

import br.edu.etec.sistemaCarro.model.Carro;

public class TesteCarro {
    public static void main(String[] Args){

        Carro branco = new Carro();
        branco.setAno("1992");
        branco.setMarca("Toyota");
        branco.setModelo("Supra Mk4");
        branco.setMotor("2Jz");
        branco.info();
    }
}