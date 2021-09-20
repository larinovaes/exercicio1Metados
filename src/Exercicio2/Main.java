package Exercicio2;


public class Main {

    public static void main(String[] args) {
        ContaBancaria dados = new ContaBancaria("Larissa Silva Novais", 1234, 0);
        System.out.println("--- Conta Corrente ---");
        dados.extrato();
        System.out.println("------------------------");
        dados.deposito(1000);
        dados.extrato();
        System.out.println("------------------------");
        dados.saque(500);
        dados.extrato();
    }
}
