package AulaDeHeranca;

public class TecAdm extends Funcionarios{
    private String administra;

    public TecAdm(String nome, String cpf, String ctps, double salario, String administra) {
        super(nome, cpf, ctps, salario);
        this.administra = administra;
    }

    public String getAdministra() {
        return administra;
    }

    public void setAdministra(String administra) {
        this.administra = administra;
    }
}
