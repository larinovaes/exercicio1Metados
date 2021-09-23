package AulaDeHeranca.Exemplo01Heranca;


public class Professor extends Funcionarios {
    private String diciplinas;

    public Professor(String nome, String cpf, String ctps, double salario, String diciplinas) {
        super(nome, cpf, ctps, salario);
        this.diciplinas = diciplinas;
    }

    public String getDiciplinas() {
        return diciplinas;
    }

    public void setDiciplinas(String diciplinas) {
        this.diciplinas = diciplinas;
    }
}
