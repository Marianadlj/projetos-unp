package projcat;

public class projeto {
    public static void main (String [] args){
        Gato ragdool;
        ragdool = new Gato();

        ragdool.setCor("Branco");
        Gato.setNome("Felix");
        ragdool.setRabo(true);
        ragdool.setRaca("Ragdool");
        ragdool.setPelo(true);

        System.out.println("Nome do gato Ragdool: " + Gato.getNome());
        System.out.println("Cor do gato Ragdool: " + Gato.getCor());

        ragdool.coca();
        ragdool.bebe();

        Gato siames;
        siames = new Gato();

        siames.setCor("Bege");
        Gato.setNome("Lucy");
        siames.setRabo(true);
        siames.setRaca("Siamês");
        siames.setPelo(true);

        System.out.println("Nome do gato Siamês: " + Gato.getNome());
        System.out.println("Cor do gato Siamês: " + Gato.getCor());

        siames.come();
        siames.dorme();

        Gato persa;
        persa = new Gato();

        persa.setCor("Cinza");
        Gato.setNome("Flofi");
        persa.setRabo(true);
        persa.setRaca("Persa");
        persa.setPelo(true);

        System.out.println("Nome do gato Persa: " + Gato.getNome());
        System.out.println("Cor do gato Persa: " + Gato.getCor());

        persa.lambe();
        persa.dorme();
    }
}
