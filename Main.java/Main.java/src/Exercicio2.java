import java.util.Scanner;

public class Exercicio2 {
    

    //Construtor da classe: possui o MESMO NOME da classe
    public Exercicio2() {
        
        System.out.println("Segundo exercicio!");
        System.out.println("=============================");
        System.out.println("Calculadora de área!");
        System.out.println("=============================");
        Scanner teclado = new Scanner(System.in);           // o new aloca um espaço na memória
        System.out.println("Digite aqui a altura: ");
        float altura = teclado.nextFloat();
        System.out.println("Digite aqui a largura: ");
        float largura = teclado.nextFloat();
        float area = (altura * largura);
        System.out.println("A área é de: " + area);
        teclado.close(); // o closse fecha o espaço aberto pelo new

    }
    public static void main(String[] args) {
        new Exercicio2(); // Chama o construtor da classe 


    }

}
