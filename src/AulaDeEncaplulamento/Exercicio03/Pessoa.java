package AulaDeEncaplulamento.Exercicio03;


import java.util.Scanner;

/**
 *Crie uma classe para representar uma pessoa, com os atributos privados de nome, data
 * de nascimento e altura. Crie os métodos públicos necessários para sets e gets e também
 * um método para imprimir todos dados de uma pessoa. Crie um método para calcular a idade da pessoa.
 */
public class Pessoa {
    private String nome;
    private String dataDeNacimento;
    private double altura;
    private int idade;
    private int anoDeNacimento = 0;

    public Pessoa(String nome,String dataDeNacimento,int idade,int anoDeNacimento,double altura){
        this.altura = altura;
        this.dataDeNacimento = dataDeNacimento;
        this.nome = nome;
        this.idade =  idade;
        this.anoDeNacimento = anoDeNacimento;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public int getAnoDeNacimento(){
        return anoDeNacimento;
    }
    public void setAnoDeNacimento(int atualizando){
       anoDeNacimento = atualizando;
    }
    public void setDataDeNacimento(String dataDeNacimento) {
        this.dataDeNacimento = dataDeNacimento;
    }
    public void setAltura(double altura){
        this.altura = altura;
    }
    public int getIdade(){
        return idade;
    }
    public void calcularIdade(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Se deseja saber a idade da pessoa, digite o ano que está:");
        int anoatual = leitor.nextInt();
        leitor.nextLine();
        idade = anoatual - anoDeNacimento;

    }
    public void mostrarDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Data de nacimento: " + dataDeNacimento);
        System.out.println("Altura: " + altura);
        System.out.println("Idade: " + idade);
    }
}
