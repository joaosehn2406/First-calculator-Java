import java.util.Scanner;

public class Calc {
    
    public Calc () {
        Scanner calculadora = new Scanner(System.in);
        System.out.println("Primeira calculadora funcionarl!");
        System.out.println("==============================");
        System.out.println("Digite aqui operação deseja:\n"
                            + "1. Adição\n"
                            + "2. Subtração\n"
                            + "3. Divisão\n"
                            + "4. Multiplicação");

        System.out.println("Digite o número correspondente à operação desejada: ");
        int escolha = calculadora.nextInt();

        System.out.print("Digite aqui o primeiro número desejado: ");
        double num1 = calculadora.nextDouble();

        System.out.print("Digite aqui o segundo número desejado: ");
        double num2 = calculadora.nextDouble();

        double resultado = 0;
        switch(escolha) {
            case 1:
                resultado = num1 + num2;
            break;
            case 2:
                resultado = num1 - num2;
            break;
            case 3:
                resultado = num1 / num2;
            break;
            case 4:
                resultado = num1 * num2;
            break;
            default:
                System.out.println("Opção inválida");
            break;

        }
    calculadora.close();
    System.out.printf("O resultado da operação é %.2f%n", resultado);
    System.out.println("==============================");
        
    }
    public static void main(String[] args) {
        new Calc();
    }
}