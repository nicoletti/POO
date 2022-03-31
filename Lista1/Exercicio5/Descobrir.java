// 5. Elabore um programa orientado a objetos em linguagem de
// programação Java que possua 2 (duas) classes: a classe Principal e a classe
// Descobrir. A classe Principal deve invocar a classe Descobrir. A classe Descobrir
// possui um método para gerar um número aleatório entre 1 e 10, e outro método para
// verificar se o número fornecido pelo usuário é o número aleatório gerado pela classe.
// O programa deve informar se o número informado pelo usuário é maior ou menor ao
// número aleatório gerado, e pedir uma nova entrada caso o número do usuário seja
// diferente do número aleatório. O programa termina quando o usuário informar o
// mesmo número aleatório.

package exercicio5;
import java.util.Random;

public class Descobrir {
    private int numAleatorio;

    public Descobrir(){
        Random aleatorio = new Random();
        numAleatorio = aleatorio.nextInt(10  ) + 1;;
    }

    public int getNumAleatorio() {
        return numAleatorio;
    }

    public boolean verificaNumero(int numUsuario){
        return numUsuario == numAleatorio;
    }
} // Fim classe Descobrir
