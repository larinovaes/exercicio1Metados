package AulaDeHeranca.Exercicio1Heranca_Encapsulamento_Polimorfismo;

public class Main {
    public static void main(String[] args) {
        //imprimindo fornecedor
      Fornecedor fornecedor = new Fornecedor("FransiscoJoias","R.santo Amaro - SP","(11)5554-5567",2000,3000);
        System.out.println(fornecedor.retornarDados() + fornecedor.obterSaldo());

        //imprimindo colaborador
      Colaborador colaborador = new Colaborador("José","R. Benedito - SP","(11)2345-6789",35,1045,50);
        System.out.println(colaborador.mostrarDadosColaborador() + colaborador.calcularSalario());

        //imprimindo administrador
      Administrador administrador = new Administrador("Pedro","R. São Carlos - SP","(11)4567-8954",56,2499,120,300);
        System.out.println(administrador.mostrarDadosAdministrador() + "\nSalario Liquido: R$" + administrador.calcularSalario());
    }
}
