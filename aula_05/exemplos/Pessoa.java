package aula_05.exemplos;

public class Pessoa {
    String nome;
    int idade;
    Float peso;

    void apresentar() {
        System.out.println("Olá! Eu sou " + nome);
    }

    int obterIdade() {
        return idade;
    }
}
