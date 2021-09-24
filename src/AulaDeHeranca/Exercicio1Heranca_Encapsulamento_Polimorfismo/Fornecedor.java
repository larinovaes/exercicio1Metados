package AulaDeHeranca.Exercicio1Heranca_Encapsulamento_Polimorfismo;

/**
 * classe Fornecedor
 * atributos valorCredito e valorDivida
 * get/set
 * um método obterSaldo() que devolve a diferença entre os valores dos atributos
 * valorCredito e valorDivida.
 *
 */
public class Fornecedor extends Pessoa{
 private double valorCredito;
 private double valorDivida;

    //metado construtor
    public Fornecedor(String nome, String endereco, String telefone,double valorDivida,double valorCredito) {
        super(nome, endereco, telefone);
        this.valorCredito = valorCredito;
        this.valorDivida = valorDivida;
    }

    public double getValorCredito() {
        return valorCredito;
    }

    public void setValorCredito(double valorCredito) {
        this.valorCredito = valorCredito;
    }

    public double getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }
    public double obterSaldo(){
        double saldoTodal = valorCredito - valorDivida;
        return saldoTodal;
    }
    public String retornarDados(){
        String dadosFornecedor = "\nNome: " +getNome() + "\nEndereço: "+ getEndereco() +
                "\nTelefone: " + getTelefone() + "\nValor da divida: R$" + getValorDivida() +
                "\nValor de Credito: R$" + getValorCredito() + "\nSaldo: R$";
        return dadosFornecedor;
    }
}
