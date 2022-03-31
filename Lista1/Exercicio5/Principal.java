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

import java.util.Scanner;

public class Principal {

    public static void main(String [] args) {
        Descobrir jogo1 = new Descobrir();
        Scanner entrada = new Scanner(System.in);

        for (;;){
            System.out.print("Digite um número: ");
            int numUsuario = entrada.nextInt();

            if(jogo1.verificaNumero(numUsuario)) {
                System.out.println("Acertou! O numero gerado era " + jogo1.getNumAleatorio() + ".");
                break;
            } else {
                System.out.println("Errou! Tente novamente.\n");
            }
        }

    }
} // Fim classe Principal
