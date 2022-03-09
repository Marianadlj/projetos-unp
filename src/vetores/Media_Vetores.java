package vetores;

public class Media_Vetores {
    public static void main (String[] args){
        int[] vet_1 = new int[100];
        int[] vet_2 = new int[100];
        int[] vet_3 = new int[100];

        for (int i = 0; i < 100; i++){
            vet_1[i] = i;
            System.out.println(vet_1[i]);
        }

        for (int i = 100; i >= 0; i--){
            int c = 0;
            vet_2[c] = i;
            System.out.println(vet_2[c]);
            c = c + 1;
        }

        for (int i = 0; i < 100; i++){
            vet_3[i]= (vet_1[i] + vet_2[i]) / 2;
            System.out.println(vet_3[i]);
        }
    }
}
