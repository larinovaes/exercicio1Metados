package ExercicioImobiliaria;


public class Imobiliaria {

    Imovel imoveis;

    public Imobiliaria( Imovel imoveis){
        this.imoveis = imoveis;
    }

    @Override
    public String toString() {
        StringBuilder listaImovel = new StringBuilder();
       listaImovel.append("Imovel: "+ imoveis);

       return listaImovel.toString();
    }
}
