package aula_06.exemplos;

public class Exemplo1 {
    public static void main(String[] args) {
        Relogio relogio = new Relogio();
        Relogio relogio2 = new Relogio(9,2,5);

        relogio.alterarHora(23);
        relogio.alterarMinuto(12);
        relogio.alterarSegundo(60);

        System.out.println("No relógio 1, agora são: " + relogio.obterHora() + ":" + relogio.obterMinuto() + ":" + relogio.obterSegundo());
        System.out.println("No relógio 2, agora são: " + relogio2.obterHora() + ":" + relogio2.obterMinuto() + ":" + relogio2.obterSegundo());
    }
}