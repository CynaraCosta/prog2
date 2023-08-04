import java.util.Scanner;

public class questao2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[3];
        
        for (int i = 0; i < 3; i++) {
            String posicao;
            if (i == 0) {
                posicao = "primeiro";
            } else if (i == 1) {
                posicao = "segundo";
            } else {
                posicao = "terceiro";
            }
            
            System.out.println("Insira o " + posicao + " número:");
            numeros[i] = scanner.nextInt();
        }
        
        if (isFirstGreater(numeros)) {
            System.out.println("Condição satisfeita");
        } else {
            System.out.println("Erro");
        }
    }

    public static boolean isFirstGreater(int[] nums) {
        if (nums[0] > nums[1] && nums[0] > nums[2]) {
            return true;
        }
        return false;
    }
}
