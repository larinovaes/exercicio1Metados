package Exercicio1;

/**
  Crie também o método
 * darDesconto() que servirá para diminuir o preço do carro e o método pintar(), que
 * será responsável por mudar a cor do carro. Crie um carro no seu programa
 * principal, utilize os métodos criados e mostre na tela o preço e a cor do carro antes
 * e depois da utilização dos métodos.
 */
public class Carro {
    String nome;
    String frabicante;
    String cor;
    double valorDoCarro;
    double peso;

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
}
