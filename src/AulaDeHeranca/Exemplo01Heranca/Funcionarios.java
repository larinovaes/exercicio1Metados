package AulaDeHeranca.Exemplo01Heranca;

public class Funcionarios {
    private String nome;
    private String cpf;
    private String ctps;
    private double salario;

    public Funcionarios(String nome,String cpf,String ctps,double salario){
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        this.ctps = ctps;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCtps() {
        return ctps;
    }

    public void setCtps(String ctps) {
        this.ctps = ctps;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    public void mostrarDados(){
        System.out.println("--- Funcionario Escola Novais ---");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Salario: " + ctps);
        System.out.println("Salario: " + salario);
    }
}
