package aula_05.exemplos;

public class Exemplo1 {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Pessoa p2;

        p2 = new Pessoa();

        p1.nome = "Davi";
        p1.apresentar();
        System.out.println(p1.obterIdade());
        System.out.println(p1.peso);

        p2.nome = "Carla";
        p2.apresentar();

        p2 = p1;

        p1.apresentar();
        p2.apresentar();
    }
}
