import java.util.Scanner;
import java.util.Arrays;

public class questao2 {
    public static void main(String[] args) {
        double[] numbers = new double[3];

        Scanner input = new Scanner(System.in);

        System.out.println("Informe três notas, em sequência: ");

        for(int i = 0; i < 3; i++) {
            numbers[i] = input.nextDouble();
        }

        double sum = Arrays.stream(numbers).sum();
        System.out.println("Resultado da soma: " + (sum / 3));

        input.close();
    }
}
