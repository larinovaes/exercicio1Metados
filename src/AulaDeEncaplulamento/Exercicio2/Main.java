package AulaDeEncaplulamento.Exercicio2;


public class Main {

    public static void main(String[] args) {
        ContaBancaria dados = new ContaBancaria("Larissa Silva Novais", 1234, 0);
        System.out.println("--- Conta Corrente ---");
        dados.extrato();
        System.out.println("-----------------------");
        dados.setNumeroDaConta(dados.getNumeroDaConta());
        dados.extrato();
        System.out.println("------------------------------");
        dados.deposito(300);
        dados.setSaldo(dados.getSaldo());
        dados.extrato();
        System.out.println("---------------------------------");
        dados.setNomeDoCorrentista("Caique");
        dados.extrato();
    }
}
