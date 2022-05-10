package PadroesDeProjeto.Strategy;

public class TesteStrategy {
    public static void main(String[] args) {
        ComportamentoAgressivo comportamentoAgressivo = new ComportamentoAgressivo();
        ComportamentoDefensivo comportamentoDefensivo = new ComportamentoDefensivo();
        ComportamentoNormal comportamentoNormal = new ComportamentoNormal();

        Robo robo = new Robo();
        robo.setComportamento(comportamentoNormal);
        robo.mover();
        robo.mover();
        robo.setComportamento(comportamentoAgressivo);
        robo.mover();
        robo.mover();
        robo.setComportamento(comportamentoDefensivo);
        robo.mover();
    }
}
