package AulaDeHeranca.Exemplo01Heranca;


public class Inspetor extends Funcionarios {
    private String areaDeVigia;

    public Inspetor(String nome, String cpf, String ctps, double salario, String areaDeVigia) {
        super(nome, cpf, ctps, salario);
        this.areaDeVigia = areaDeVigia;
    }

    public String getAreaDeVigia() {
        return areaDeVigia;
    }

    public void setAreaDeVigia(String areaDeVigia) {
        this.areaDeVigia = areaDeVigia;
    }

}
