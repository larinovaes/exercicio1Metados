package ListaDeExerciciosComplementar;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bola_Exercicio01 dados = new Bola_Exercicio01("Jabulani", "azul", "Redonda", "Plastico");
        dados.mostrarDados();
        System.out.println("---------------------");

        Scanner leitor = new Scanner(System.in);
        System.out.println("Qual nome deseja colocar na bola?");
        String nome = leitor.nextLine();

        dados.setNome(nome);
        System.out.println("Nome da bola atual" + dados.getNome());

        System.out.println("Qual cor deseja para sua bola?");
        String mudarCor = leitor.nextLine();

        dados.setCor(mudarCor);
        System.out.println("Cor atual da bola: " + dados.getCor());
    }
}
