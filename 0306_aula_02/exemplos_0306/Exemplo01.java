package exemplos_0306;

public class Exemplo01 {

    public static void main(String[] args) {
        boolean teste = false;

        if (teste) {
            System.out.println("Verdadeiro");
        } else {
            System.out.println("Falso");
        }

        if (teste) System.out.println("Verdadeiro");
        else System.out.println("Falso");
    }
}