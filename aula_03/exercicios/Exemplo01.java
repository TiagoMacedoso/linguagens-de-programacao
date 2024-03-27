package exercicios;

import java.util.Scanner;

public class Exemplo01{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira um número inteiro ao qual deseja obter a tabuado no mesmo: ");
        int numero = entrada.nextInt();

        System.out.println("Insira um número inteiro que será o último multiplicador: ");
        int seletor = entrada.nextInt();

        System.out.println("\n Tabuada do " + numero + " até o " + seletor);

        for (int i = 0; i <= seletor; i++) {
            System.out.println(numero + " x " + seletor + " = " + numero*i);
        }
    }
}