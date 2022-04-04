// 3. Um estacionamento deve ser capaz de cadastrar o tipo do veículo,
// a placa, o horário de saída e o horário de entrada do veículo.
// O valor a ser pago é de acordo com a seguinte tabela:
//
// Período                     Valor
// Até 30 minutos              Gratuito
// De 30 minutos até 1 hora    R$ 10,00
// Acima de 1 hora             R$ 20,00
//
// Nomes: Estacionamento, Veiculo
// Adjetivos:  tipo, placa, hrSaida, hrEntrada, valorPago
// Verbos: Cadastrar

package exercicio3;

public class Principal {

    public static void main (String[] args){
        Estacionamento obj = new Estacionamento();
        Veiculo v1 = new Veiculo("carro", "AAA1234", "09:30", "12:30");
        v1.calculaValor();

        obj.cadastrar(v1);

        System.out.println(v1);


    }
}
