package exercicio6;

// A classe Desempenho computa o número de jogadas, e o número de
// tentativas do pior e melhor jogo.

public class Desempenho {
    private int piorJogo;
    private int melhorJogo;
    private int totalJogadas;

    public Desempenho(){
        setTotalJogadas(0);
        setPiorJogo(0);
        setMelhorJogo(0);
    }

    public void setPiorJogo(int piorJogo) {
        this.piorJogo = piorJogo;
    }

    public void setMelhorJogo(int melhorJogo) {
        this.melhorJogo = melhorJogo;
    }

    public void setTotalJogadas(int totalJogadas) {
        this.totalJogadas = totalJogadas;
    }

    public void computaJogo(int tentativas){
        setTotalJogadas(totalJogadas + 1);

        if (tentativas > piorJogo) setPiorJogo(tentativas);
        if (tentativas < melhorJogo) setMelhorJogo(tentativas);
        else if (melhorJogo == 0) setMelhorJogo(tentativas);
    }

    public String toString(){
        return "\n# DESEMPENHO #\n" +
                "Total de Jogadas: " + totalJogadas + "\n" +
                "Pior jogo: " + piorJogo + " tentativas" + "\n" +
                "Melhor jogo: " + melhorJogo + " tentativas";
    }
}
