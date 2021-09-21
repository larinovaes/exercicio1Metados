package ListaDeExerciciosComplementar;

public class Main {
    public static void main(String[] args) {
        Bola_Exercicio01 dados = new Bola_Exercicio01("Jabulani","azul","Redonda","Plastico");
        dados.mostrarDados();
        System.out.println("---------------------");
        dados.trocarCor("Verde");
        dados.mostrarDados();
    }
}
