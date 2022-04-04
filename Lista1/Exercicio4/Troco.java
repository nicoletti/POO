// Classe Troco calcula o troco a partir da diferença
// entre o valor recebido e o valor a pagar.

package exercicio4;

import java.util.Scanner;

public class Troco{
   private int valorTroco;

   public Troco(){
    setValorTroco(0);
   }

   public void setValorTroco(int valorTroco){
       this.valorTroco = valorTroco;
   }

   public void calcularTroco(Veiculo veiculo){
       int valorTotal;
       int valorRecebido;

       System.out.print("Digite o valor recebido: ");
       Scanner entrada = new Scanner(System.in);
       valorRecebido = entrada.nextInt();

       if (veiculo.getValorTotal() == "R$ 10,00")
            valorTotal = 10;
       else if (veiculo.getValorTotal() == "R$ 20,00")
           valorTotal = 20;
       else
           valorTotal = 0;

       setValorTroco(valorRecebido - valorTotal);

       System.out.println("Troco: R$ " + valorTroco + ",00");
   }


}// Fim classe Troco
