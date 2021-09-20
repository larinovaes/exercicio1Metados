package Exercicio1;

public class Carro {
    String nome;
    String frabicante;
    String cor;
    double valorDoCarro;
    double peso;
    double daDesconto;

    public Carro(String nome,String frabicante, String cor, double valorDoCarro,double peso){
        this.nome = nome;
        this.frabicante = frabicante;
        this.cor = cor;
        this.valorDoCarro = valorDoCarro;
        this.peso = peso;
    }

    public void mostrarDados(){
        System.out.println("Nome do carro escolhido: " +nome);
        System.out.println("Fabricante: " + frabicante);
        System.out.println("Cor: " + cor);
        System.out.println("Valor do carro: " + valorDoCarro);
        System.out.println("peso: " + peso + "kg");
    }
    public void pintar(String pintando){
       cor = "Vermelho";
    }
    public void daDesconto(double daDesconto){
        valorDoCarro = valorDoCarro - daDesconto;
    }
}
