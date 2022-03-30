// 9.Elabore um programa orientado a objetos em linguagem de
// programação Java que possua 3 (três) classes: a classe Principal, a classe
// Computador e a classe Data. A classe Principal deve invocar a classe Computador. A
// classe Computador deve utilizar encadeamento de métodos para ser invocada na
// Classe Principal da seguinte forma:
// Computador c = new Computador( );
// c.setNome("comp1").setMarca("Intel").setData(1,1,2001);

package exercicio9;

public class Principal {

    public static void main(String [] args){
        Computador c = new Computador();

        c.setNome("comp1").setMarca("Intel").setData(1,1,2000);

        System.out.println(c);
    }
} // Fim classe Principal
