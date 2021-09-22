package ListaDeExerciciosComplementar;

/**
 * Classe Bola: Crie uma chamada Jabulani
 * 1. Atributos: Cor, circunferência, material
 * 2. Métodos: trocaCor e mostraCor
 */
public class Bola_Exercicio01 {
    private String nome;
    private String cor;
    private String circunferencia;
    private String material;

    public Bola_Exercicio01(String nome,String cor,String circunferencia,String material){
        this.circunferencia = circunferencia;
        this.cor = cor;
        this.material = material;
        this.nome = nome;
    }
    public String getCor(){
        return cor;
    }
    public void setCor(String mudarAcor){
        cor = mudarAcor;
    }

    public void setCircunferencia(String tipoCircunferencia){
        circunferencia = tipoCircunferencia;
    }
    public void setMaterial(String tipoDeMaterial){
        material = tipoDeMaterial;
    }
    public void mostrarDados(){
        System.out.println("Nome da Bola: " + nome);
        System.out.println("Cor: " + cor);
        System.out.println("Circunferência: " + circunferencia);
        System.out.println("Material: " + material);
    }

}
