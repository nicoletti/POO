package exercicio2;

public class Calculadora {
    private int opcao;
    private float num1;
    private float num2;

    public Calculadora(int opcao, float num1, float num2){
        setOpcao(opcao);
        setNum1(num1);
        setNum2(num2);
    }

    public void setOpcao(int opcao){
        this.opcao = opcao;
    }

    public void setNum1(float num1){
        this.num1 = num1;
    }

    public void setNum2(float num2){
        this.num2 = num2;
    }

    public String resultado(){

        switch (opcao){
            case 1:
                return "Abs(" + num1 + ") = " + Math.abs(num1);
            case 2:
                return "Ceil(" + num1 + ") = " + Math.ceil(num1);
            case 3:
                return "Cos(" + num1 + ") = " + Math.cos(num1);
            case 4:
                return "Exp(" + num1 + ") = " + Math.exp(num1);
            case 5:
                return "Floor(" + num1 + ") = " + Math.floor(num1);
            case 6:
                return "Log(" + num1 + ") = " + Math.log(num1);
            case 7:
                return "Max(" + num1 + ", " + num2 + ") = " + Math.max(num1, num2);
            case 8:
                return "Min(" + num1 + ", " + num2 + ") = " + Math.min(num1, num2);
            case 9:
                return "Pow(" + num1 + ", " + num2 + ") = " + Math.pow(num1, num2);
            case 10:
                return "Sqrt(" + num1 + ") = " + Math.sqrt(num1);
            default:
                return "Opção inválida!";
        }
    }
} // Fim classe Calculadora
