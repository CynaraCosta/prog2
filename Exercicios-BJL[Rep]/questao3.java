import java.util.Scanner;

public class questao3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int quantidadePositivos = 0;
        int numero;

        do {
            System.out.println("Insira um número:");
            numero = sc.nextInt();

            if (numero > 0) {
                quantidadePositivos++;
            }
        } while (numero != 0);

        System.out.println("Quantidade de positivos: " + quantidadePositivos);
    }
}
