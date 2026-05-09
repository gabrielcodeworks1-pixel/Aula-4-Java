/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.sistemacontrole.teste;
import br.edu.etec.sistemacontrole.model.Usuario;
import br.edu.etec.sistemacontrole.model.NivelAcesso;

public class Teste {
    public static void main(String[] args) {
        Usuario admin = new Usuario("admin", "1234", NivelAcesso.ADMIN, true);
        boolean loginOk = admin.autenticar("1234");
        System.out.println("Login valido? " + loginOk);
        System.out.println("Nivel: " + admin.getNivel());
        
        admin.desativar();
        System.out.println("Apos desativar:");
        System.out.println("Login valido? " + admin.autenticar("1234"));
    }
}