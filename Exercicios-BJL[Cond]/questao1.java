import java.util.Scanner;

public class questao1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o primeiro número:");
        int numero1 = sc.nextInt();

        System.out.println("Insira o segundo número:");
        int numero2 = sc.nextInt();

        if (numero1 > numero2) {
            System.out.println("O maior é: " + numero1);
        } else if (numero1 < numero2) {
            System.out.println("O maior é: " + numero2);
        } else {
            System.out.println("Os números são iguais");
        }
    }
}
