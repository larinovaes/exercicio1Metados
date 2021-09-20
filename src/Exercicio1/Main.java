package Exercicio1;

public class Main {

    public static void main(String[] args) {
        Carro dados = new Carro("Kwid", "Nissan", "Branco", 47690, 806);
        dados.mostrarDados();
        System.out.println("----------------------------");
        dados.pintar("Vermelho");
        dados.mostrarDados();
        System.out.println("----------------------------");
        dados.daDesconto(1000);
        dados.mostrarDados();
    }
}
