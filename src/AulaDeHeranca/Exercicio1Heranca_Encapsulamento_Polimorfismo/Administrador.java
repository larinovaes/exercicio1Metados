package AulaDeHeranca.Exercicio1Heranca_Encapsulamento_Polimorfismo;


public class Administrador extends Colaborador{
     private double ajudaDeCusto;

     //metado construtor
    public Administrador(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto,double ajudaDeCusto) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.ajudaDeCusto = ajudaDeCusto;
    }

    public double getAjudaDeCusto() {
        return ajudaDeCusto;
    }

    public void setAjudaDeCusto(double ajudaDeCusto) {
        this.ajudaDeCusto = ajudaDeCusto;
    }
    @Override
    //metado para calcular a ajuda de custo junto ao salario e imposto
    public double calcularSalario(){
        double salarioLiquido = getSalarioBase() - getImposto();
        salarioLiquido = salarioLiquido + ajudaDeCusto;
        return salarioLiquido;
    }
    public String mostrarDadosAdministrador(){
        String dados = "\nNome: " +getNome() + "\nEndereço: "+ getEndereco() +
                "\nTelefone: " + getTelefone() + "\nSalario Base: R$" + getSalarioBase() +
                "\nImposto: R$" + getImposto() +"\nAjuda de Custo: R$" + getAjudaDeCusto();
        return dados;
    }
}
