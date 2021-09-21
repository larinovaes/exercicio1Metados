package Exercicio04;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        CartaoDeCredito dados = new CartaoDeCredito("Larissa Novais", 1000,0,0);
        dados.mostrarDados();
        System.out.println("-----------------------------");
        dados.realizarCompra(100);
        dados.realizarCompra(400);
        dados.realizarCompra(2000);
        System.out.println("----Fatura mensal-----");
        System.out.println("\nNome do titular do cartão: " + (dados.nomeDoCliente));
        System.out.println("\nLimite disponivel: R$" +(dados.limite));
        System.out.println("-----------------------------------------");
        dados.aumentarLimite(true);
        dados.mostrarDados();



    }
}
