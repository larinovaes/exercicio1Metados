package AulaDeHeranca.Exercicio1Heranca_Encapsulamento_Polimorfismo;
/**
 * Crie uma Classe Pessoa, contendo os atributos encapsulados, com seus respectivos
 * seletores (getters) e modificadores (setters).
 * Atributos: String nome; String endereco; String telefone;
 */
public class Pessoa {
    private String nome;
    private String endereco;
    private String telefone;

    public Pessoa(String nome,String endereco,String telefone) {
        this.endereco = endereco;
        this.telefone = telefone;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String novoNome) {
        this.nome = novoNome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String novoEndereco) {
        this.endereco = novoEndereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String novoTelefone) {
        this.telefone = novoTelefone;
    }
}
