package listaDeExercicioEncapsulamentoHerancaPolimorfismo;

/**
 * Os funcionários administrativos possuem os atributos: Função Administrativa e Senioridade.
 */
public class FuncionariosAdministrativos extends Funcionarios {
    private String funcaoAdministrativa;
    private String senioridade;

    public FuncionariosAdministrativos(String nome, String cpf, String orgaoDeLotacao, int numeroDeregistro, double salario, String funcaoAdministrativa, String senioridade) {
        super(nome, cpf, orgaoDeLotacao, numeroDeregistro, salario);
        this.funcaoAdministrativa = funcaoAdministrativa;
        this.senioridade = senioridade;
    }

    public String getFuncaoAdministrativa() {
        return funcaoAdministrativa;
    }

    public void setFuncaoAdministrativa(String funcaoAdministrativa) {
        this.funcaoAdministrativa = funcaoAdministrativa;
    }

    public String getSenioridade() {
        return senioridade;
    }

    public void setSenioridade(String senioridade) {
        this.senioridade = senioridade;
    }
    @Override
    public double aumentoSalario(){
        double aumento = (0.1 * getSalario()) + getSalario();
        return aumento;
    }
    public String retornandoDadosFun_Administrativos(){
        String dados = "\nNome: " + getNome()+ "\nCPF: " +getCpf()+ "\nNúmero de registro: "+getNumeroDeregistro()+
        "\nórgão de lotação: " +getOrgaoDeLotacao()+"\nSalário: "+getSalario()+ "\nFunção Administrativa: "+getFuncaoAdministrativa()
                + "\nSenioridade: "+getSenioridade();
        return dados;
    }
}
