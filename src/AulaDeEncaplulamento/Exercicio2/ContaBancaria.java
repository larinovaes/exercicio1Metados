package AulaDeEncaplulamento.Exercicio2;

public class ContaBancaria {

    private int numeroDaConta;
    private double saldo;
    private String nomeDoCorrentista;

    public ContaBancaria(String nomeDoCorrentista, int numeroDaConta,double saldo){
        this.nomeDoCorrentista = nomeDoCorrentista;
        this.numeroDaConta = numeroDaConta;
        this.saldo = saldo;
    }
    public int getNumeroDaConta(){
        return numeroDaConta;
    }
    public void setNumeroDaConta( int numeroDaConta1){
        numeroDaConta1 = numeroDaConta;
    }
    public double getSaldo(){
        return saldo;
    }
    public void setSaldo( double saldo1){
        saldo1 = saldo;
    }
    public String getNomeDoCorrentista(){
        return nomeDoCorrentista;
    }
    public void setNomeDoCorrentista(String nomeAtualizado){
        nomeDoCorrentista = nomeAtualizado;
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
