package Exercicio2;

public class ContaBancaria {

    int numeroDaConta;
    double saldo;
    String nomeDoCorrentista;

    public ContaBancaria(String nomeDoCorrentista, int numeroDaConta,double saldo){
        this.nomeDoCorrentista = nomeDoCorrentista;
        this.numeroDaConta = numeroDaConta;
        this.saldo = saldo;
    }
    public void extrato(){
        System.out.println("Nome do corretista: " + nomeDoCorrentista);
        System.out.println("Número da conta: " + numeroDaConta);
        System.out.println("Saldo R$: " + saldo);
    }
    public void deposito(double valorDedepoisto){
        saldo = saldo + valorDedepoisto;
    }
    public void saque(double valorAsErRetirado){
        saldo = saldo - valorAsErRetirado;

    }
}
