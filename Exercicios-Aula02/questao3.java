import java.util.Scanner;

public class questao3 {
    public static void main(String[] args) {
        double salary = 0.0;

        Scanner input = new Scanner(System.in);

        System.out.println("Insira o salário:");
        salary = input.nextDouble();

        System.out.println("Resultado da soma: " + (salary * 1.25));

        input.close();
    }
}
