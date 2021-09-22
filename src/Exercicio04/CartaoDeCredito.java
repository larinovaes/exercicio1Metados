package Exercicio04;

import java.util.Scanner;

public class CartaoDeCredito {
    Scanner leitor = new Scanner(System.in);

    double limiteTotal;
    double limiteAtual;
    double saldo;
    double fatura;
    String nomeDoCliente;

    //metado construtor
    public CartaoDeCredito(String nomeDoCliente, double limiteTotal, double saldo, double fatura) {
        this.fatura = fatura;
        this.limiteTotal = limiteTotal;
        this.limiteAtual = limiteTotal;
        this.saldo = saldo;
        this.nomeDoCliente = nomeDoCliente;
    }

    //Metado mostrar dados
    public void mostrarDados() {
        System.out.println("Nome do cliente: " + nomeDoCliente);
        System.out.println("Limite: R$" + limiteAtual);
        System.out.println("Saldo de compras: " + saldo);
    }

    // Metado para relaziar compra no cartão
    public void realizarCompra(double fazendoCompras) {

        if (limiteAtual >= fazendoCompras) {
            limiteAtual -= fazendoCompras;
            System.out.println("Você realizou uma compra no valor de: R$" + fazendoCompras);
            System.out.println("Limite atual é: R$" + limiteAtual);
        } else {
            System.out.println("Você atigiu o seu limite, a compra não pode ser efetuada!");
        }
    }

    public void imprimirFatura() {
        double valorFatura = limiteTotal - limiteAtual;
        System.out.println("\nValor a ser pago será: R$" + valorFatura);
    }

    public void aumentarLimite() {
        System.out.println("Se deseja aumentar seu limite digite 1");
        System.out.println("Se deseja sair deigite 2");
        int opcao = leitor.nextInt();
        leitor.nextLine();

        if (opcao == 1) {
            limiteAtual += limiteTotal;
            limiteTotal *= 2;
            System.out.println("Seu limite foi liberado para aumento!");
            System.out.println("Seu limite atual é: R$" + limiteAtual);
        } else if (opcao == 2) {
            System.out.println("Voce saiu do programa!");
        } else {
            System.out.println("Por favor digite uma opção válida!!");
        }
    }
}

