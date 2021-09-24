package ListaDeExerciciosComplementar.Exercicio03;

/**
 * Classe Retangulo: Crie uma classe que modele um retângulo:
 * Atributos: LadoA, LadoB (ou Comprimento e Largura, ou Base e
 * Altura, a escolher)
 * Métodos: Mudar valor dos lados, Retornar valor dos lados, calcular
 * Área e calcular Perímetro
 */
public class Retangulo {
    private double base;
    private double altura;

    public Retangulo(double ladaA,double ladoB) {
        this.base = ladaA;
        this.altura = ladoB;
    }
    public double getBase() {
        return base;
    }
    public void setBase(double novoLadaA) {
        this.base = novoLadaA;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double novoLadoB) {
        this.altura = novoLadoB;
    }
    public double calcularArea(){
        double area = base * altura;
        return area;
    }
    public double calcularPerimetro(){
        double perimetro = 2 * (getAltura() + getBase());
        return perimetro;
    }
    public String dadosDoRetangulo(){
        String dados = "\nBase: " + getBase() + "\nAltura: " + getAltura();
        return  dados;
    }
}
