public class Painel {
    private int maxX, minX, maxY, minY;
    
    public Painel(int maxX, int maxY) {
        this.maxX = maxX;
        this.minX = 0;
        this.maxY = maxY;
        this.minY = 0;
    }

    public boolean posicaoValida(int x, int y, int deslocamento, Direcao direcao) {
        if (direcao == Direcao.NORTE) {
            return (y - deslocamento >= this.minX);
        } else if(direcao == Direcao.SUL) {
            return (y + deslocamento <= this.maxX);
        } else if(direcao == Direcao.OESTE) {
            return (x - deslocamento >= this.minY);
        } else if(direcao == Direcao.LESTE) {
            return (x + deslocamento <= this.maxY);
        } else {
            return false;
        }
    }
}