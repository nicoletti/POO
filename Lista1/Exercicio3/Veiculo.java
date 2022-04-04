package exercicio3;


public class Veiculo {
    private String tipo;
    private String placa;
    private int hrEntrada;
    private int minEntrada;
    private int hrSaida;
    private int minSaida;
    private String valorPago;

    public Veiculo(String tipo, String placa,
    String entrada, String saida) {
        setTipo(tipo);
        setPlaca(placa);
        setHrEntrada(entrada);
        setHrSaida(saida);
        setValorPago("");
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public void setPlaca(String placa){
        this.placa = placa;
    }

    public void setHrEntrada(String entrada) {
        String[] str = entrada.split(":");
        hrEntrada = Integer.parseInt(str[0]);
        minEntrada = Integer.parseInt(str[1]);
    }

    public void setHrSaida(String saida) {
        String[] str = saida.split(":");
        hrSaida = Integer.parseInt(str[0]);
        minSaida = Integer.parseInt(str[1]);
    }

    public void setValorPago(String valorPago){
        this.valorPago = valorPago;
    }

    public void calculaValor() {
        int diferenca = ((hrSaida-hrEntrada)*60) + (minSaida - minEntrada);

        if (diferenca < 30)
            this.valorPago = "Gratuito";
        else if ((diferenca >= 30) && (diferenca <= 60))
            this.valorPago = "R$ 10,00";
        else
            this.valorPago = "R$ 20,00";
    }

    public String toString(){
        return "Tipo Veiculo: " + tipo + "\n" +
                "Placa: " + placa + "\n" +
                "Entrada: " + hrEntrada + ":" + minEntrada + "\n" +
                "Saida: " + hrSaida + ":" + minSaida + "\n" +
                "Valor pago: " + valorPago + "\n";
    }
}// Fim classe Veículo
