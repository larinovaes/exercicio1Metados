package AulaDeHeranca.Exemplo01Heranca;

public class Main {

    public static void main(String[] args) {

        Professor informacoes = new Professor("Larissa","7324637","372647",1045,"matematica");
        informacoes.mostrarDados();
        System.out.println("Diciplina: " + informacoes.getDiciplinas());
        System.out.println("---------------------------------------------------");
        Inspetor dados = new Inspetor("mainha","83423","63254",27543,"patio");
        dados.mostrarDados();
        System.out.println("Area de vigia: " + dados.getAreaDeVigia());
        System.out.println("---------------------------------------------------");
        TecAdm informacao = new TecAdm("Pedro", "92347","23658",7234,"escola");
        informacao.mostrarDados();
        System.out.println("Administra: " + informacao.getAdministra());
        System.out.println("---------------------------------------------------");
    }
}
