/* Exemplo 01 */

/* Comentário de bloco */

// comentário de linha

package exemplos;

import java.util.Scanner;

public class Exemplo01{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Hello, world!");
        System.out.println("\n|Calculadora de IMC|\n");

        System.out.println("Informe seu Nome:");
        String nome = sc.nextLine();

        System.out.println("\nInforme seu peso:");
        double peso = sc.nextDouble();

        System.out.println("\nInforme sua altura: ");
        double altura = sc.nextDouble();

        double resultado;

        resultado = peso/(altura*altura);

        System.out.println("|Calculadora de IMC|\n");

        System.out.println(nome + " seu IMC é:" + resultado + "\n");

        if (resultado < 18.5) {
            System.out.println("Cuidado! Você está em situação de MAGREZA.");
        } else if (resultado >= 18.5 && resultado <=24.9) {
            System.out.println("Parabéns! O seu IMC está na faixa IDEAL!");
        } else if (resultado >= 25 && resultado <= 29.9) {
            System.out.println("Cuidado! Você está com SOBREPESO!");
        } else if (resultado >= 30 && resultado <= 39.9) {
            System.out.println("ATENÇÃO! Você está com OBESIDADE!!");
        } else if (resultado > 40) {
            System.out.println("PROCURE AJUDA! Você está com OBESIDADE GRAVE!");
        }
    }

}