package AulaDeHeranca.Exercicio1Heranca_Encapsulamento_Polimorfismo;

/**
 *Crie uma subclasse da classe Pessoa, chamada classe Colaborador.
 * atributos codigoSetor (inteiro), salarioBase (double) e imposto (double).
 * Um método calcularSalario
 */
public class Colaborador extends Pessoa{
    private int codigoSetor;
    private double salarioBase;
    private double imposto;

    //metado construtor da subclass Colaborador junto a class mãe Pessoa
    public Colaborador(String nome, String endereco, String telefone,int codigoSetor,double salarioBase,double imposto) {
        super(nome, endereco, telefone);
        this.codigoSetor = codigoSetor;
        this.imposto = imposto;
        this.salarioBase = salarioBase;
    }

    public int getCodigoSetor() {
        return codigoSetor;
    }

    public void setCodigoSetor(int codigoSetor) {
        this.codigoSetor = codigoSetor;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    public double getImposto(){
        return imposto;
    }
    public void setImposto(double imposto){
        this.imposto = imposto;
    }
    //metado para calcular o salario bruto
    public double calcularSalario(){
        double salarioBruto = salarioBase - imposto;
        return salarioBruto;
    }
    public String mostrarDadosColaborador(){
        String dados = "\nNome: " +getNome() + "\nEndereço: "+ getEndereco() +
                "\nTelefone: " + getTelefone() + "\nSalario Base: R$" + getSalarioBase() +
                "\nImposto: R$" + getImposto() + "\nSalario Bruto: R$";
        return dados;
    }
}
