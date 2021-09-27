package listaDeExercicioEncapsulamentoHerancaPolimorfismo;
/**
 * todos os funcionários em atributos como: Nome, CPF, número de registro, órgão de lotação e salário.
 */
public class Funcionarios{
    private String nome;
    private String cpf;
    private String orgaoDeLotacao;
    private int numeroDeregistro;
    private double salario;

    public Funcionarios(String nome,String cpf, String orgaoDeLotacao, int numeroDeregistro, double salario){
        this.cpf = cpf;
        this.numeroDeregistro = numeroDeregistro;
        this.orgaoDeLotacao = orgaoDeLotacao;
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getOrgaoDeLotacao() {
        return orgaoDeLotacao;
    }

    public void setOrgaoDeLotacao(String orgaoDeLotacao) {
        this.orgaoDeLotacao = orgaoDeLotacao;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getNumeroDeregistro() {
        return numeroDeregistro;
    }

    public void setNumeroDeregistro(int numeroDeregistro) {
        this.numeroDeregistro = numeroDeregistro;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    public double aumentoSalario(){
        double aumento = (0.1 * salario) + salario;
        return aumento;
    }

}
