import java.util.Scanner;
import java.lang.Math;

public class questao5 {
    public static void main(String[] args) {
        int firstNumber = 0;
        int secondNumber = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Insira o primeiro número:");
        firstNumber = input.nextInt();

        System.out.println("Insira o segundo número:");
        secondNumber = input.nextInt();

        System.out.println("Resultado: " + Math.pow(firstNumber, secondNumber));

        input.close();
    }
}
