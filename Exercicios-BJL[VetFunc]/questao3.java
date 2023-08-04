import java.util.Scanner;

public class questao3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Insira um número:");
        int numero = scanner.nextInt();
        
        parImpar(numero);
    }

    public static void parImpar(int num) {
        if (num % 2 == 0) {
            System.out.println(num + " é par.");
        } else {
            System.out.println(num + " é ímpar.");
        }
    }
}
