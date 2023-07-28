import java.util.Scanner;

public class questao4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o primeiro valor:");
        int valor1 = sc.nextInt();

        System.out.println("Insira o segundo valor:");
        int valor2 = sc.nextInt();

        if (valor1 == valor2) {
            int multiplicacao = valor1 * valor2;
            System.out.println("Multiplicação: " + multiplicacao);
        } else if (valor1 > valor2) {
            int subtracao = valor1 - valor2;
            System.out.println("Subtração: " + subtracao);
        } else {
            int soma = valor1 + valor2;
            System.out.println("Soma: " + soma);
        }
    }
}
