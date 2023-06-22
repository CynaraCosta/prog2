import java.util.Scanner;
import java.util.Arrays;

public class questao1 {
    public static void main(String[] args) {
        int[] numbers = new int[4];

        Scanner input = new Scanner(System.in);

        System.out.println("Informe quatro números, em sequência:");

        for(int i = 0; i < 4; i++) {
            numbers[i] = input.nextInt();
        }

        int sum = Arrays.stream(numbers).sum();
        System.out.println("Resultado da soma: " + sum);

        input.close();
    }
}
