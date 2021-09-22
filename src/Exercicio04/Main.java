package Exercicio04;

/**
Crie uma classe que represente um cartão de crédito, que deve ter como
atributos o seu limite, o saldo da fatura e nome do cliente. Crie também os métodos
aumentaLimite(), diminuiLimite(), realizaCompra() que não deve permitir uma
compra caso o limite tenha sido atingido e o imprimeFatura() que imprime na tela o
valor da fatura.
 */

public class Main {

    public static void main(String[] args) {

        CartaoDeCredito dados = new CartaoDeCredito("Larissa Novais", 1000,0,0);
        dados.mostrarDados();
        System.out.println("-----------------------------");
        dados.realizarCompra(500);
        dados.realizarCompra(140);
        dados.realizarCompra(500);

        System.out.println("----Fatura mensal-----");
        System.out.println("\nNome do titular do cartão: " + (dados.nomeDoCliente));
        System.out.println("\nLimite disponivel: R$" +(dados.limiteAtual));
        dados.imprimirFatura();
        System.out.println("-----------------------------------------");
        dados.aumentarLimite();
        dados.mostrarDados();
        System.out.println("------------------------------------------");



    }
}
