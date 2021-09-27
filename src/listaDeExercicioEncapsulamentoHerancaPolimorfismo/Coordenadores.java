package listaDeExercicioEncapsulamentoHerancaPolimorfismo;

import java.util.ArrayList;
import java.util.List;

public class Coordenadores extends Funcionarios{
    private List<Professores> professoresSuper = new ArrayList<>();

    public Coordenadores(String nome, String cpf, String orgaoDeLotacao, int numeroDeregistro, double salario) {
        super(nome, cpf, orgaoDeLotacao, numeroDeregistro, salario);
    }

    public void adicionandoProf(Professores prof){
        professoresSuper.add(prof);
    }

    public void exibirProfessoresSupervisionados(){
        for (Professores referencia:professoresSuper) {
            System.out.println(referencia);
        }
    }
    public List<Professores> getProfessoresSuper() {
        return professoresSuper;
    }

    @Override
    public double aumentoSalario(){
        double aumento = (0.05 * getSalario() + getSalario());
        return aumento;
    }
    public String toString() {
        StringBuilder retornarDados = new StringBuilder();
        retornarDados.append("\n Professores supervisionados: " + professoresSuper);
        return retornarDados.toString();
    }
}
