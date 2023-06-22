import java.util.Scanner;

public class questao4 {
    public static void main(String[] args) {
        int base = 0;
        int height = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Insira a base:");
        base = input.nextInt();

        System.out.println("Insira a altura:");
        height = input.nextInt();

        System.out.println("Area do triangulo: " + ((base  * height) / 2));

        input.close();
    }
}
