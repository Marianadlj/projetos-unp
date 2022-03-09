package vetores;

public class Criando_Vetor {
    public static void main (String[] args) {
        int soma = 0;
        int[] vetor = new int[5];

        for (int i = 0; i < 5; i++) {
            vetor[i] = i * 5;
        }

        for(int i = 0; i < 5; i++){
            System.out.println(vetor[i]);
        }

        for(int i = 0; i < 5; i++){
            soma = soma + vetor[i];
        }

        System.out.println("Soma dos números armazenados no vetor: " + soma);
    }
}
