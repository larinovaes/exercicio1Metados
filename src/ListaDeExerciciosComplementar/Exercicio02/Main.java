package ListaDeExerciciosComplementar.Exercicio02;

public class Main {
    public static void main(String[] args) {
        Quadrado dados = new Quadrado("",0);
        dados.mostrarDados();
        System.out.println("---------------------------------");
        dados.setLados("Direito");
        dados.setTamanho(13);
        dados.mostrarDados();
        dados.calcular();
        System.out.println("----------------------------------");
        dados.setLados("Esquerdo");
        dados.setTamanho(14);
        dados.mostrarDados();
        dados.calcular();
        System.out.println("-----------------------------------");
        dados.setLados("Direito");
        dados.setTamanho(2);
        dados.mostrarDados();
        dados.calcular();

    }
}
