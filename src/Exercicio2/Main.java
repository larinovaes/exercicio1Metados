package Exercicio2;

import Exercicio1.Carro;

public class Main {
    public static void main(String[] args) {
        Carro dados = new Carro("Kwid","Nissan","Branco", 476900, 806);
        dados.mostrarDados();
        System.out.println("----------------------------");
        dados.pintar("Vermelho");
        dados.mostrarDados();
        dados.daDesconto(1000);
        dados.mostrarDados();
    }
}
