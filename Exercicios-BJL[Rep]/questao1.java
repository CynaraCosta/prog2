public class questao1 {
    public static void main(String[] args) {
        int inicio = 1;
        int fim = 10;
        int somatorio = 0;

        for (int i = inicio; i <= fim; i++) {
            somatorio += i;
        }

        System.out.println("Somatório: " + somatorio);
    }
}
