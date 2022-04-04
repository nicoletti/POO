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
//
// 4. Adição de uma nova classe ao exercício anterior. Explique, com um comentário
// de bloco no início da classe, o propósito dessa nova classe. A classe deve ser
// utilizada durante a execução do programa e conter a definição de novos atributos
// e comportamentos.

package exercicio4;

public class Principal {

    public static void main (String[] args){
        Estacionamento obj = new Estacionamento();
        Veiculo v1 = new Veiculo("carro", "AAA1234", "09:30", "12:30");
        Troco troco1 = new Troco();

        v1.calculaValor();
        obj.cadastrar(v1);

        System.out.println(v1);

        troco1.calcularTroco(v1);
    }
}// Fim classe Principal
