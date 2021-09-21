package exercicio03;


public class Elevador {
    int andarAtual;
    int totalDePassageiros;
    int qtdDeAndares;
    int capacidade;

    public Elevador(int andarAtual, int totalDePassageiros, int qtdDeAndares, int capacidade) {
        this.andarAtual = andarAtual;
        this.totalDePassageiros = totalDePassageiros;
        this.qtdDeAndares = qtdDeAndares;
        this.capacidade = capacidade;
    }

    public void entra(int quantidadeDePessoas) {
        int totalDeViajantes = quantidadeDePessoas + totalDePassageiros;
        if (totalDeViajantes > capacidade) {
            System.out.println("O elevador não cabe mais pessoas");
            System.out.println("O limite ultrapassado foi: " + (totalDeViajantes - capacidade));
        } else {
            totalDePassageiros = totalDeViajantes;
            System.out.println("A quantidade de pessoas no elevador é: " + totalDePassageiros);
        }
    }

    public void sai(int qtdDePessoasAsair) {
        int totalDeViajantesASair = totalDePassageiros - qtdDePessoasAsair;
        if (totalDeViajantesASair < 0) {
            System.out.println("voce não pode retirar uma quantidade maior que a de pessoas presentes!");
        } else {
            totalDePassageiros = totalDeViajantesASair;
            System.out.println("A quantidade de passageiros presente é: " + totalDeViajantesASair);
        }
    }

    public void subir(int subindo) {
        if (subindo > 0 && subindo <= 13) {
            System.out.println("Você subiu para o " + subindo + " andar!");
        } else {
            System.out.println("Esse andar não existe!");
        }
    }

    public void descer(int descendo) {
        if (descendo >= 1 && descendo < 13) {
            System.out.println("Você desceu para o " + descendo + " andar");
        } else if (descendo == 0) {
            System.out.println("Você está no térreo!");
        } else {
            System.out.println("O elevador não tem mais como descer!");
        }
    }

    public void mostrarDados() {
        System.out.println("Quantidade de pessoas dentro do elevador: " + totalDePassageiros);
        System.out.println("Capacidade do elevador: " + capacidade);
        System.out.println("Andar atual: " + andarAtual);
    }
}
