package ExercicioImobiliaria;

//Class IMOVEL
//Atributos: Endereco,Valor do aluguel,Funcionario responsavel. moradores que será caracteristicas.

import java.util.ArrayList;
import java.util.List;

public class Imovel{

    Moradores inquilinos;

    private String endereco;
    private String funcionarioResponsavel;
    private String nome;
    private double valorDoAluguel;

    private List<Imovel> imovels = new ArrayList<>();

    public Imovel(String endereco, String funcionarioResponsavel,String nome,double valorDoAluguel) {
        this.endereco = endereco;
        this.funcionarioResponsavel = funcionarioResponsavel;
        this.valorDoAluguel = valorDoAluguel;
        this.nome = nome;
    }

    public Moradores getInquilinos() {
        return inquilinos;
    }

    public void setInquilinos(Moradores inquilinos) {
        this.inquilinos = inquilinos;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getFuncionarioResponsavel() {
        return funcionarioResponsavel;
    }

    public void setFuncionarioResponsavel(String funcionarioResponsavel) {
        this.funcionarioResponsavel = funcionarioResponsavel;
    }

    public double getValorDoAluguel() {
        return valorDoAluguel;
    }

    public void setValorDoAluguel(double valorDoAluguel) {
        this.valorDoAluguel = valorDoAluguel;
    }

    public void setImovels(List<Imovel> imovels) {
        this.imovels = imovels;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Imovel(Moradores inquilinos){
        this.inquilinos = inquilinos;
    }
    public void addImovels(Imovel lista){
        imovels.add(lista);
    }
    public void exibirImovel(){
        for (Imovel lista: imovels) {
            System.out.println(lista);
        }
    }
    public List<Imovel> getImovels() {
        return imovels;
    }
    public String toString(){
        StringBuilder dados = new StringBuilder();
        dados.append("\nNome: "+ nome);
        dados.append("\nEndereço: " +endereco);
        dados.append("\nFuncionario Responsavel: " +funcionarioResponsavel);
        dados.append("\nValor do Aluguel: " +valorDoAluguel);

        return dados.toString();
    }
}
