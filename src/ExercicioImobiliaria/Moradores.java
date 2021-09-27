package ExercicioImobiliaria;

//Class Moradores
//Atributos : Nome,Telefone

import java.util.ArrayList;
import java.util.List;

public class Moradores {
    private List<Moradores> moradores = new ArrayList<>();
    private String nome;
    private  String telefone;

    public Moradores(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public void setMoradores(List<Moradores> moradores) {
        this.moradores = moradores;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void  adicionandoMorador(Moradores morador){
        moradores.add(morador);
    }
    public void exibicao(){
        for (Moradores referencia: moradores) {
            System.out.println(referencia);
        }
    }
    public List<Moradores> getMoradores() {
        return moradores;
    }

    public String toString(){
        StringBuilder dadosMoradores = new StringBuilder();
        dadosMoradores.append("\nNome: " +nome);
        dadosMoradores.append("\nTelefone: "+ telefone);
        return dadosMoradores.toString();
    }
}
