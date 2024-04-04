package aula_06.exemplos;

public class Relogio {
    private int hora, minuto, segundo;

    public Relogio() {}

    public Relogio(int hora, int minuto, int segundo) {
        alterarHora(hora);
        alterarMinuto(minuto);
        alterarSegundo(segundo);
    }

    public void alterarHora(int hora){
        this.hora = (hora >= 0 && hora < 24) ? hora : 0;
    }

    public void alterarMinuto(int minuto){
        this.minuto = (minuto >= 0 && minuto < 60) ? minuto : 0;
    }

    public void alterarSegundo(int segundo){
        this.segundo = (segundo >= 0 && segundo < 60) ? segundo : 0;
    }

    public String obterHora(){
        return (hora < 10) ? "0" + (hora + "") : hora + "";
    }

    public String obterMinuto(){
        return (minuto < 10) ? "0" + (minuto + "") : minuto + "";
    }

    public String obterSegundo(){
        return (segundo < 10) ? "0" + (segundo + "") : segundo + "";
    }
}