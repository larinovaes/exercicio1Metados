package ExercicioImobiliaria;

public class Main {


    public static void main(String[] args) {

        Imovel imovel1 = new Imovel("R.SAO PAULO", "joao","CASA VERMELHA", 1222);
        Moradores inquilino1 = new Moradores("José","2733-5478");
        inquilino1.adicionandoMorador(inquilino1);
        imovel1.addImovels(imovel1);
       // imovel1.exibirImovel();
        //System.out.println("---Moradores---- "+ "\n"+ inquilino1);

        Imovel imovel2 = new Imovel("R. larissa","Joao","CASA AMARELA",2344);
        Moradores inquilino3 = new Moradores("Pedro","2733-2352");
        inquilino3.adicionandoMorador(inquilino3);
        imovel2.addImovels(imovel2);
        //imovel2.exibirImovel();
        //System.out.println("---Moradores---- "+ "\n"+ inquilino3);

        Imovel imovel3 = new Imovel("R. São Bento","JOSÉ","CASA VERDE",1233);
        Moradores inquilino5 = new Moradores("Fabiana","2833-5402");
        inquilino3.adicionandoMorador(inquilino5);
        imovel3.addImovels(imovel3);
        //imovel3.exibirImovel();


        Imobiliaria imobiliaria = new Imobiliaria(imovel3);
        imobiliaria.exibirListaDeImoveis();
        System.out.println("---Moradores---- "+ "\n"+ inquilino5);



    }
}
