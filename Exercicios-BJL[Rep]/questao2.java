import java.util.Scanner;

public class questao2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o valor de A:");
        int a = sc.nextInt();

        System.out.println("Insira o valor de B:");
        int b = sc.nextInt();

        System.out.println("Série numérica:");

        // Verifica se A é menor que B para determinar o início e o fim do loop
        int inicio = Math.min(a, b) + 1;
        int fim = Math.max(a, b) - 1;

        for (int i = inicio; i <= fim; i++) {
            System.out.print(i + " ");
        }

        System.out.println(); // Quebra de linha para melhor visualização
    }
}
