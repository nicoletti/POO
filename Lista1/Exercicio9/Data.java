package exercicio9;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data() {
        setData(0,0,0);
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    public void setData(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
} // Fim classe Data

