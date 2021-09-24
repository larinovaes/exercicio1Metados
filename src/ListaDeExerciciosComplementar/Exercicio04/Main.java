package ListaDeExerciciosComplementar.Exercicio04;

public class Main {
    public static void main(String[] args) {
     Pessoa pessoa = new Pessoa("José",2,8,1);
        System.out.println(pessoa.retornarDados());

        pessoa.setIdade(3);
        System.out.println(pessoa.crescer());
    }
}
