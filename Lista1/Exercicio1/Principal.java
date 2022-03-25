import java.util.Scanner;

public class Principal {

    public static void menu(){
        System.out.print("""
                # MENU #
                1. Abs
                2. Ceil
                3. Cos
                4. Exp
                5. Floor
                6. Log
                7. Max
                8. Min
                9. Pow
                10. Sqrt
                
                Digite o número da opção desejada:""");
    }

    public static void main(String[] args) {
        // Imprimir menu com as funções
        menu();

        Scanner entrada = new Scanner(System.in);
        int opcao = entrada.nextInt();

        System.out.print("Digite um número:");
        float num1 = Float.parseFloat(entrada.next());
        float num2 = 0;

        // Para as funções Max, Min e Pow são necessários dois números.
        if (opcao >= 7 && opcao <= 9){
            System.out.print("Digite o segundo número:");
            num2 = Float.parseFloat(entrada.next());
        }

        Calculadora calc = new Calculadora(opcao, num1, num2);

        calc.resultado(opcao, num1);
    }
} // Fim da classe Principal

