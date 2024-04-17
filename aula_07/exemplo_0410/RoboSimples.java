public class RoboSimples {
    private int posX, posY;

    private Painel painel;

    public RoboSimples(Painel painel) {
        this.painel = painel;
    }

    public void mover(Direcao direcao, int deslocamento) {
        if (painel.posicaoValida(posX, posY, deslocamento, direcao)) {
            System.out.println("\nPosição Válida\n");
            switch (direcao) {
                case NORTE:
                    posX += deslocamento;
                    break;
                case SUL:
                    posX = posX + deslocamento;
                    break;
                case LESTE:
                    posY += deslocamento;
                    break;
                case OESTE:
                    posY += deslocamento;
                    break;
            }
        } else {
            System.out.println("\nPosição inválida\n");
        }     
    }

    public String posicaoAtual() {
        return posX + "," + posY;
    }
}
