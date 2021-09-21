package ListaDeExerciciosComplementar;

/**
 * Classe Bola: Crie uma chamada Jabulani
 * 1. Atributos: Cor, circunferência, material
 * 2. Métodos: trocaCor e mostraCor
 */
public class Bola_Exercicio01 {
    String nome;
    String cor;
    String circunferencia;
    String material;

    public Bola_Exercicio01(String nome,String cor,String circunferencia,String material){
        this.circunferencia = circunferencia;
        this.cor = cor;
        this.material = material;
        this.nome = nome;
    }
    public void trocarCor(String trocarAcor){

    }
    public void mostrarDados(){
        System.out.println("Nome da Bola: " + nome);
        System.out.println("Cor De referencia: " + cor);
        System.out.println("Circunferência: " + circunferencia);
        System.out.println("Material: " + material);
    }

}
