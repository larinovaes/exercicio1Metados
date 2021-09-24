package ListaDeExerciciosComplementar.Exercicio04;
/**
 * Classe Pessoa: Crie uma classe que modele uma pessoa:
 *  Atributos: nome, idade, peso e altura
 *  Métodos: Envelhecer, engordar, emagrecer, crescer. Obs: Por padrão,
 * a cada ano que nossa pessoa envelhece, sendo a idade dela menor
 * que 21 anos, ela deve crescer 0,5 cm.
 */
public class Pessoa {
    private String nome;
    private int idade;;
    private double peso;
    private double altura;

    public Pessoa(String nome, int idade, double peso, double altura) {
        this.altura = altura;
        this.idade = idade;
        this.peso = peso;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int novaIdade) {
        this.idade = novaIdade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double envelhecer(){
        return getIdade();
    }
    public double engordar(){
        double engordando = getIdade() + 1;
        return  engordando;
    }
    public double emagrecer(){
        double emagrecendo = 80;
        emagrecendo  = getPeso();
        return  getPeso();
    }
    public double crescer(){
       double crescendo = getIdade() + 0.5;
       return crescendo;
    }
    public String retornarDados(){
      String dados = "\nNome: " + getNome() + "\nAltura: " +getAltura()+ " m" + "\nIdade: " + getIdade()
              + " anos" + "\nPeso: " + getPeso() + "kg";
      return dados;
    }
}
