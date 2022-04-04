// 7. Elabore um programa orientado a objetos em linguagem de
// programação Java que possua 2 (duas) classes: a classe Principal e a classe Pendulo.
// A classe Principal deve invocar a classe Pendulo. A classe Pendulo possui métodos
// acessores e mutadores para atribuir a quantidade de oscilações em um display gráfico
// da seguinte forma:
// A:[0,30]     B:[0,30]    C: [0,30]

// Por exemplo, se a quantidade de oscilações é maior que 30, o display C retorna para o
// Valor 0 (zero) e incrementa uma unidade no display B. Se a quantidade de oscilações
// no display B é maior que 30, o display B e C retornam para 0 (zero) e o display A é
// incrementado em 1 (uma) unidade. (Dica: veja o exercício da aula4prog1)

package exercicio7;

import javax.swing.*;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        int a;
        int b;
        int c;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Oscilações do pêndulo A: ");
        a = entrada.nextInt();

        System.out.print("Oscilações do pêndulo B: ");
        b = entrada.nextInt();

        System.out.print("Oscilações do pêndulo C: ");
        c = entrada.nextInt();

        Pendulo p = new Pendulo(a, b, c);
        p.alteracoes();

        String mensagem = p.mensagem();

        final JDialog dialog = new JDialog();
        dialog.setAlwaysOnTop(true);
        JOptionPane.showMessageDialog(dialog, mensagem);

        System.exit(0);
    }
}