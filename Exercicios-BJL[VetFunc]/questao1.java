import java.util.Scanner;

public class questao1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Insira o primeiro número:");
        int numero1 = scanner.nextInt();
        
        System.out.println("Insira o segundo número:");
        int numero2 = scanner.nextInt();
        
        maior(numero1, numero2);
    }

    public static void maior(int num1, int num2) {
        if (num1 > num2) {
            System.out.println("O maior é: " + num1);
        } else if (num2 > num1) {
            System.out.println("O maior é: " + num2);
        } else {
            System.out.println("Os números são iguais");
        }
    }
}
