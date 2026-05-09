/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.sistemadepagamentos.teste;
import br.edu.etec.sistemadepagamentos.model.PagamentoCartao;
public class Teste {
    public static void main(String[] args) {
        PagamentoCartao pagamento = new PagamentoCartao(250.00, "1234567812345678");
        pagamento.exibirStatus();
        System.out.println();
        pagamento.processarPagamento();
        System.out.println();
        pagamento.exibirStatus();
    }
}