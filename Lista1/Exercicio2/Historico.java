// A classe Historico cria uma lista dos resultados
// da classe Calculadora

package exercicio2;

import java.util.ArrayList;
import java.util.Iterator;

public class Historico {
    ArrayList listaHistorico;

    public Historico(){
        listaHistorico = new ArrayList();
    }

    public void salvarResultado(String resultado){
        listaHistorico.add(resultado);
    }

    public String toString(){
        String resultado = "";
        Iterator i = listaHistorico.iterator();

        while (i.hasNext())
            resultado += i.next() + "\n";

        return resultado;
    }

} // Fim classe Historico
