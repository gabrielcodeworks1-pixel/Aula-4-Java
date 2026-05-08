/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.sistemaCarro.model;

public class Carro {
    String Ano;
    String Marca;
    String Modelo;
    String Motor;
    public String getAno() {
        return Ano;
    }
    public void setAno(String Ano) {
        this.Ano = Ano;
    }
    public String getMarca() {
        return Marca;
    }
    public void setMarca(String Marca) {
        this.Marca = Marca;
    }
    public String getModelo() {
        return Modelo;
    }
    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }   

    public String getMotor() {
        return Motor;
    }

    public void setMotor(String Motor) {
        this.Motor = Motor;
    }
    
    public void info(){
        System.out.println("- - Informacoes do Carro - -");
        System.out.println("Ano: " + Ano);
        System.out.println("Marca: " + Marca);
        System.out.println("Modelo: " + Modelo);
        System.out.println("Motor: " + Motor);
    }
}