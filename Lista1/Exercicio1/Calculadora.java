package exercicio1;

import java.lang.Math;

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

    public void resultado(int opcao, float num1){

        System.out.println("\n# RESULTADO #");
        switch (opcao){
            case 1:
                System.out.println("Abs(" + num1 + ") = " + Math.abs(num1));
                break;
            case 2:
                System.out.println("Ceil(" + num1 + ") = " + Math.ceil(num1));
                break;
            case 3:
                System.out.println("Cos(" + num1 + ") = " + Math.cos(num1));
                break;
            case 4:
                System.out.println("Exp(" + num1 + ") = " + Math.exp(num1));
                break;
            case 5:
                System.out.println("Floor(" + num1 + ") = " + Math.floor(num1));
                break;
            case 6:
                System.out.println("Log(" + num1 + ") = " + Math.log(num1));
                break;
            case 7:
                System.out.println("Max(" + num1 + ", " + num2 + ") = " + Math.max(num1, num2));
                break;
            case 8:
                System.out.println("Min(" + num1 + ", " + num2 + ") = " + Math.min(num1, num2));
                break;
            case 9:
                System.out.println("Pow(" + num1 + ", " + num2 + ") = " + Math.pow(num1, num2));
                break;
            case 10:
                System.out.println("Sqrt(" + num1 + ") = " + Math.sqrt(num1));
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
    }
} // Fim da classe Calculadora
