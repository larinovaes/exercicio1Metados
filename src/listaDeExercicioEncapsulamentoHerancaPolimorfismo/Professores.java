package listaDeExercicioEncapsulamentoHerancaPolimorfismo;

/**
 * Os professores possuem os atributos: Nível de graduação, disciplina ministrada ,
 * quantidade de alunos e quantidade de turmas.
 */
public class Professores extends Funcionarios {
    private String nivelDeGraduacao;
    private String disciplinaMinistrada;
    private double quantidadeDeAlunos;
    private double quantidadeDeTurmas;

    public Professores(String nome, String cpf, String orgaoDeLotacao, int numeroDeregistro, double salario, String nivelDeGraduacao, String disciplinaMinistrada, double quantidadeDeAlunos, double quantidadeDeTurmas) {
        super(nome, cpf, orgaoDeLotacao, numeroDeregistro, salario);
        this.nivelDeGraduacao = nivelDeGraduacao;
        this.disciplinaMinistrada = disciplinaMinistrada;
        this.quantidadeDeAlunos = quantidadeDeAlunos;
        this.quantidadeDeTurmas = quantidadeDeTurmas;
    }

    public String getNivelDeGraduacao() {
        return nivelDeGraduacao;
    }

    public void setNivelDeGraduacao(String nivelDeGraduacao) {
        this.nivelDeGraduacao = nivelDeGraduacao;
    }

    public String getDisciplinaMinistrada() {
        return disciplinaMinistrada;
    }

    public void setDisciplinaMinistrada(String disciplinaMinistrada) {
        this.disciplinaMinistrada = disciplinaMinistrada;
    }

    public double getQuantidadeDeAlunos() {
        return quantidadeDeAlunos;
    }

    public void setQuantidadeDeAlunos(double quantidadeDeAlunos) {
        this.quantidadeDeAlunos = quantidadeDeAlunos;
    }

    public double getQuantidadeDeTurmas() {
        return quantidadeDeTurmas;
    }

    public void setQuantidadeDeTurmas(double quantidadeDeTurmas) {
        this.quantidadeDeTurmas = quantidadeDeTurmas;
    }

    @Override
    public double aumentoSalario() {
        double aumento = getSalario() / 10;
        return aumento;
    }

    public double adicionaTurma() {
        quantidadeDeTurmas++;
        return quantidadeDeTurmas;
    }

    @Override
    public String toString() {
        StringBuilder dados = new StringBuilder();
        dados.append("\nNome: " + getNome());
        dados.append("\nCPF: " + getCpf());
        dados.append("\nNúmero de registro: " + getNumeroDeregistro());
        dados.append("\nórgão de lotação: " + getOrgaoDeLotacao());
        dados.append("\nSalário: " + getSalario());
        dados.append("\nNivel De graduação: " + nivelDeGraduacao);
        dados.append("\nDisciplina Ministrada: " + disciplinaMinistrada);
        dados.append("\nQuantidade De Alunos: " + quantidadeDeAlunos);
        dados.append("\nQuantidade De Turmas: " + quantidadeDeTurmas);
        return dados.toString();
    }
}


