import java.util.Scanner;

public class questao5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite 1 para somar;");
        System.out.println("Digite 2 para subtrair;");
        System.out.println("Digite 3 para multiplicar;");
        System.out.println("Digite 4 para dividir;");
        int opcao = sc.nextInt();

        System.out.println("Insira o primeiro valor:");
        int valor1 = sc.nextInt();

        System.out.println("Insira o segundo valor:");
        int valor2 = sc.nextInt();

        switch (opcao) {
            case 1:
                int soma = valor1 + valor2;
                System.out.println("Soma: " + soma);
                break;
            case 2:
                int subtracao = valor1 - valor2;
                System.out.println("Subtração: " + subtracao);
                break;
            case 3:
                int multiplicacao = valor1 * valor2;
                System.out.println("Multiplicação: " + multiplicacao);
                break;
            case 4:
                if (valor2 == 0) {
                    System.out.println("Divisão por zero.");
                } else {
                    int divisao = valor1 / valor2;
                    System.out.println("Divisão: " + divisao);
                }
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }
    }
}
