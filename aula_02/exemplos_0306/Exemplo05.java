package exemplos_0306;

import java.util.Scanner;

public class Exemplo05 {
    public static void main(String[] args) {
        int count = 1;

        /* Incremento posterior */
        while (count < 10) {
            System.out.println(count++);
        }

        /* Incremento anterior */
        while (count < 10) {
            System.out.println(++count);
        }

        Scanner sc = new Scanner(System.in);

        int valor;

        do{
            System.out.println("\n\nInforme valor inteiro entre 1 e 10: ");
            valor = sc.nextInt();
        } while(valor < 1 || valor > 10);

        System.out.println("Você digitou " + valor + ".");
    }
}
