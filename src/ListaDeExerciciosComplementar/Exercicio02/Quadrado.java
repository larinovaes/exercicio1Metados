package ListaDeExerciciosComplementar.Exercicio02;

import java.util.Scanner;

/**
 * Classe Quadrado: Crie uma classe que modele um quadrado:
 * 1. Atributos: Tamanho do lado
 * 2. Métodos: Mudar valor do Lado, Retornar valor do Lado e calcular
 * Área;
 */
public class Quadrado {

    private double tamanho;
    private String lados;

    public Quadrado(String lados, double tamanho) {
        this.tamanho = tamanho;
        this.lados = lados;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public String getLados() {
        return lados;
    }

    public void setLados(String lados) {
        this.lados = lados;
    }

    public void mostrarDados() {
        System.out.println("O lado é:" +getLados());
        System.out.println("O tamanho é: "+ getTamanho());
    }

    public void calcular() {
        double area = tamanho * tamanho;
        System.out.println("A area do quadrado é " + area + "metros");

    }
}
