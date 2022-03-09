package vetores;

public class Criando_Vetor_Bidimensional {
    public static void main(String[] args) {
        int[][] m = { {1, 2, 3}, { 4, 5, 6 } };

        for (int i = 0; i < 2; i++) {
            System.out.printf("%da. Linha: ", (i + 1));

            for (int j =0; j < 3; j++) {
                System.out.printf("%d ", m[i][j]);
            }
            System.out.print("\n");
        }
    }
}
