import java.util.Scanner;

public class questao2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o primeiro número:");
        int numero1 = sc.nextInt();

        System.out.println("Insira o segundo número:");
        int numero2 = sc.nextInt();

        System.out.println("Insira o terceiro número:");
        int numero3 = sc.nextInt();

        if (numero1 > numero2 && numero1 > numero3) {
            System.out.println("Condição satisfeita");
        } else {
            System.out.println("Erro");
        }
    }
}
