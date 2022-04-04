// 5. Elabore um programa orientado a objetos em linguagem de
// programação Java que possua 2 (duas) classes: a classe Principal e a classe
// Descobrir. A classe Principal deve invocar a classe Descobrir. A classe Descobrir
// possui um método para gerar um número aleatório entre 1 e 10, e outro método para
// verificar se o número fornecido pelo usuário é o número aleatório gerado pela classe.
// O programa deve informar se o número informado pelo usuário é maior ou menor ao
// número aleatório gerado, e pedir uma nova entrada caso o número do usuário seja
// diferente do número aleatório. O programa termina quando o usuário informar o
// mesmo número aleatório.
//
// 6. Adição de uma nova classe ao exercício anterior. Explique, com um comentário
// de bloco no início da classe, o propósito dessa nova classe. A classe deve ser
// utilizada durante a execução do programa e conter a definição de novos atributos
// e comportamentos.

package exercicio6;

import java.util.Scanner;

public class Principal {

    public static void main(String [] args) {
        Descobrir jogo1 = new Descobrir();
        Scanner entrada = new Scanner(System.in);
        int numUsuario;
        int menu;

        Desempenho desempenho = new Desempenho();
        int tentativas = 0;

        for (;;){
            System.out.print("Digite um número: ");
            numUsuario = entrada.nextInt();

            if(jogo1.verificaNumero(numUsuario)) {
                System.out.println("Acertou! O numero gerado era " + jogo1.getNumAleatorio() + ".\n");
                tentativas = tentativas + 1;
                desempenho.computaJogo(tentativas);

                jogo1 = new Descobrir();

                System.out.print("Digite (0) para sair e (1) para jogar novamente: ");
                menu = entrada.nextInt();

                if (menu == 0) break;
                System.out.println("\nIniciando novo jogo...");
                tentativas = 0;
            } else {
                System.out.println("Errou! Tente novamente.\n");
                tentativas = tentativas + 1;
            }
        }

        System.out.println(desempenho);
    }
} // Fim classe Principal
