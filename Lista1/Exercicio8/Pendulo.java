package exercicio8;

public class Pendulo {
    private int a;
    private int b;
    private int c;

    // Contrutor

    public Pendulo(){
        setA(0);
        setB(0);
        setC(0);
    }
    public Pendulo(int a, int b, int c){
        setA(a);
        setB(b);
        setC(c);
    }

    // Métodos acessores
    public int getA(){
        return this.a;
    }

    public int getB(){
        return this.b;
    }

    public int getC(){
        return this.c;
    }

    // Métodos mutadores
    public void setA(int a){
        this.a = a;
    }

    public void setB(int b){
        this.b = b;
    }

    public void setC(int c){
        this.c = c;
    }

    public void alteracoes(){
        if (c > 30){
            c = 0;
            b += 1;
        }

        if (b > 30){
            b = c = 0;
            a += 1;
        }

        if (a > 30){
            a = 30;
        }
    }

    public String mensagem(){
        return "A:[" + getA() + "]        " +
                "B:[" + getB() + "]        " +
                "C:[" + getC() + "]\n";
    }

} // Fim classe Pendulo