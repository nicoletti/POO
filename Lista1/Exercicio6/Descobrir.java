package exercicio6;
import java.util.Random;

public class Descobrir {
    private int numAleatorio;

    public Descobrir(){
        Random aleatorio = new Random();
        numAleatorio = aleatorio.nextInt(10) + 1;;
    }

    public int getNumAleatorio() {
        return numAleatorio;
    }

    public boolean verificaNumero(int numUsuario){
        return numUsuario == numAleatorio;
    }
} // Fim classe Descobrir
