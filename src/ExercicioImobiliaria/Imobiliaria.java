package ExercicioImobiliaria;


import java.util.List;

public class Imobiliaria {

    Imovel imoveis;

    public Imobiliaria(Imovel imoveis){
        this.imoveis = imoveis;
    }

    public void exibirListaDeImoveis(){
        for (Imovel imoveis: imoveis.getImovels()) {
            System.out.println(imoveis);
        }
    }

    @Override
    public String toString() {
        StringBuilder listaImovel = new StringBuilder();
       listaImovel.append("---- Imovel ----- "+ imoveis);

       return listaImovel.toString();
    }
}
