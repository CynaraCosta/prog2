import java.util.Scanner;

public class questao4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o valor de A:");
        int a = sc.nextInt();

        System.out.println("Insira o valor de B:");
        int b = sc.nextInt();

        // Verifica se A é menor que B para determinar o início do loop
        int inicio = Math.min(a, b);

        for (int i = inicio; i <= b; i++) {
            if (i % 2 != 0) {
                System.out.println("É impar: " + i);
            }
        }
    }
}
