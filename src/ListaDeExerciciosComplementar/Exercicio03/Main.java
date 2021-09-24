package ListaDeExerciciosComplementar.Exercicio03;

public class Main {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo(24,56);
        System.out.println("--- Retângulo ---");
        System.out.println(retangulo.dadosDoRetangulo() + "\nÁrea: " + retangulo.calcularArea() + "\nPerímetro: " + retangulo.calcularPerimetro());

        retangulo.setAltura(23);
        retangulo.setBase(2);
        System.out.println("--- Retângulo ---");
        System.out.println(retangulo.dadosDoRetangulo() + "\nÁrea: " + retangulo.calcularArea() + "\nPerímetro: " + retangulo.calcularPerimetro());

    }


}
