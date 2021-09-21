package Exercicio04;

import javax.swing.*;
import java.util.Scanner;

public class CartaoDeCredito {
    Scanner leitor = new Scanner(System.in);
    double limite = 1000;
    double saldo;
    double fatura;
    String nomeDoCliente;

    //metado construtor
    public CartaoDeCredito(String nomeDoCliente, double limite, double saldo, double fatura) {
        this.fatura = fatura;
        this.limite = limite;
        this.saldo = saldo;
        this.nomeDoCliente = nomeDoCliente;
    }

    //Metado mostrar dadoss
    public void mostrarDados() {
        System.out.println("Nome do cliente: " + nomeDoCliente);
        System.out.println("Limite: R$" + limite);
        System.out.println("Saldo de compras: " + saldo);
    }

    // Metado para relaziar compra no cartão
    public void realizarCompra(double fazendoCompras) {
        double passandoDoLimite = limite - fazendoCompras;

        if (limite > fazendoCompras) {
            System.out.println("Compra relalizada com sucesso!");
            System.out.println("Seu saldo para compras é: " + passandoDoLimite);
        } else if (fazendoCompras > limite) {
            System.out.println("Você atigiu o seu limite, a compra não pode ser efetuada!");
        }
    }

    public void imprimirFatua() {
        System.out.println("\nValor a ser pago será: R$" + fatura);

    }

    public void aumentarLimite(boolean menu) {
        while (menu) {
            System.out.println("Se deseja aumentar seu limite digite 1");
            System.out.println("Se deseja sair deigite 2");
            int opcao = leitor.nextInt();
            leitor.nextLine();
            if (opcao == 1) {
                System.out.println("Seu limite foi liberado para aumento!");
                System.out.println("Seu limite atual é: R$" + (limite * 2));
            } else if (opcao == 2) {
                System.out.println("Voce saiu do programa!");
                menu = false;
            }
        }
    }
}
