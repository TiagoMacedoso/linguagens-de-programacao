public class Exemplo {
    public static void main(String[] args) {
        Painel painel = new Painel(50, 50);
        RoboSimples roboSimples = new RoboSimples(painel);

        roboSimples.mover(Direcao.SUL, 7);
        System.out.println(roboSimples.posicaoAtual());
    }
}
