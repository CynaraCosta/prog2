import java.util.Scanner;

public class questao5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[5];
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Insira o dado da posição " + (i + 1) + ":");
            vetor[i] = scanner.nextInt();
        }
        
        System.out.println("Insira a chave de busca:");
        int chave = scanner.nextInt();
        
        int indice = buscarChave(vetor, chave);
        
        if (indice != -1) {
            System.out.println("Chave encontrada na posição: " + (indice + 1));
        } else {
            System.out.println("Chave não encontrada!");
        }
    }

    public static int buscarChave(int[] vetor, int chave) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == chave) {
                return i;
            }
        }
        return -1; // Retorna -1 se a chave não for encontrada
    }
}
