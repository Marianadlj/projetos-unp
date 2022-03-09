package projcat;

public class projeto {
    public static void main (String [] args){
        Gato ragdool;
        ragdool = new Gato();

        ragdool.cor = "Branco";
        Gato.nome = "Felix";
        ragdool.rabo = true;
        ragdool.raca = "Ragdool";
        ragdool.pelo = true;

        System.out.println("Nome do gato Ragdool: " + Gato.nome);
        System.out.println("Cor do gato Ragdool: " + ragdool.cor);

        ragdool.coca();
        ragdool.bebe();

        Gato siames;
        siames = new Gato();

        siames.cor = "Bege";
        Gato.nome = "Lucy";
        siames.rabo = true;
        siames.raca = "Siamês";
        siames.pelo = true;

        System.out.println("Nome do gato Siamês: " + Gato.nome);
        System.out.println("Cor do gato Siamês: " + siames.cor);

        siames.come();
        siames.dorme();

        Gato persa;
        persa = new Gato();

        persa.cor = "Cinza";
        Gato.nome = "Flofi";
        persa.rabo = true;
        persa.raca = "Persa";
        persa.pelo = true;

        System.out.println("Nome do gato Persa: " + Gato.nome);
        System.out.println("Cor do gato Persa: " + persa.cor);

        persa.lambe();
        persa.dorme();
    }
}
