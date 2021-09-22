package AulaDeEncaplulamento.Exercicio03;


public class Main {
    public static void main(String[] args) {
        Pessoa serHumano = new Pessoa("Larissa","11/03",0,1999,1.58);
        serHumano.mostrarDados();
        System.out.println("-----------------------------------");
        serHumano.setNome("Joao");
        serHumano.setAltura(1.82);
        serHumano.setDataDeNacimento("18/03");
        serHumano.calcularIdade();
        serHumano.setAnoDeNacimento(1992);
        serHumano.mostrarDados();

    }
}
