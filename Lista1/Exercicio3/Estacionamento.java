package exercicio3;

import java.util.ArrayList;

public class Estacionamento {
    ArrayList listaVeiculos;

    public Estacionamento(){
        listaVeiculos = new ArrayList();
    }

    public void cadastrar(Veiculo veiculo){
        this.listaVeiculos.add(veiculo);
    }
}
