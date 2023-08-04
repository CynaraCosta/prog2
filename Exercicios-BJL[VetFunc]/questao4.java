import java.util.Scanner;

public class questao4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] vetor = new double[5];
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Insira o dado da posição " + (i + 1) + ":");
            double valor = scanner.nextDouble();
            
            // Verifica se o valor está entre 1 e 100
            if (valor >= 1 && valor <= 100) {
                vetor[i] = valor;
            } else {
                System.out.println("Valor fora do intervalo permitido. Insira novamente:");
                i--; // Volta para a mesma posição para inserir o valor correto
            }
        }
        
        dividir100(vetor);
        
        System.out.println("Conteúdo dividido por 100:");
        for (int i = 0; i < 5; i++) {
            System.out.println(vetor[i]);
        }
    }

    public static void dividir100(double[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] /= 100;
        }
    }
}
