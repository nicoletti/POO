// 7. Elabore um programa orientado a objetos em linguagem de
// programação Java que possua 2 (duas) classes: a classe Principal e a classe Pendulo.
// A classe Principal deve invocar a classe Pendulo. A classe Pendulo possui métodos
// acessores e mutadores para atribuir a quantidade de oscilações em um display gráfico
// da seguinte forma:

package exercicio7;

import javax.swing.*;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        int a, b, c;
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

    }
}
