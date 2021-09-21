package exercicio03;


public class Main {

    public static void main(String[] args) {
        Elevador dados = new Elevador(0, 0, 13, 5);
        dados.mostrarDados();
        System.out.println("------------------------------");
        dados.entra(4);
        System.out.println("-------------------------------");
        dados.sai(2);
        System.out.println("--------------------------------");
        dados.sai(2);
        System.out.println("--------------------------------");
        dados.entra(3);
        System.out.println("-----------------------------------");
        dados.subir(9);
        System.out.println("------------------------------------");
        dados.subir(13);
        System.out.println("------------------------------------");
        dados.subir(15);
        System.out.println("------------------------------------");
        dados.descer(10);
        System.out.println("------------------------------------");
        dados.descer(1);
        System.out.println("------------------------------------");
        dados.descer(0);
        System.out.println("------------------------------------");
        dados.descer(-2);
        System.out.println("Por favor se não for mais subir,saia do elevador");
        dados.sai(3);


    }
}