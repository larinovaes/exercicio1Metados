package listaDeExercicioEncapsulamentoHerancaPolimorfismo;

public class Main {


    public static void main(String[] args) {

        FuncionariosAdministrativos funcionariosAdministrativos = new FuncionariosAdministrativos("Joao","14223","lei",152,623,"Fazer pagamento","jr");
        System.out.println(funcionariosAdministrativos.retornandoDadosFun_Administrativos() + "\nAumento de: "+funcionariosAdministrativos.aumentoSalario());

        Professores professores = new Professores("Joana","12753","BH",723,1234,"Mestrado","Biologia",20,4);
        Coordenadores coordenador = new Coordenadores("joao","3274","4564",34,3999);

        coordenador.adicionandoProf(professores);
        System.out.println(coordenador);

    }
}
