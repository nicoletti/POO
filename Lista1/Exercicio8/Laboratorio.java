// Classe Laboratorio cria uma lista com a data e horário
// da realização do experimento

package exercicio8;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;

public class Laboratorio {
    ArrayList listaUsoLaboratorio;
    DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    public Laboratorio(){
        listaUsoLaboratorio = new ArrayList();
    }

    public void usoLaboratorio(){
        listaUsoLaboratorio.add(df.format(LocalDateTime.now()));
    }

    public String toString(){
        String retorno = "";
        Iterator i = listaUsoLaboratorio.iterator();

        while (i.hasNext())
            retorno += i.next() + "\n";

        return retorno;
    }

} // Fim classe Laboratorio