package projcat;

public class Gato {
    private static String cor;
    private static String nome;
    private String raca;
    private boolean pelo;
    private boolean rabo;

    void dorme (){
        System.out.println("Novidade! " + Gato.nome + " está dormindo.");
    }

    void lambe (){
        System.out.println(Gato.nome + " está se lambendo!");
    }

    void coca (){
        System.out.println(Gato.nome + " está se coçando, pode não ser nada, mas eu investigaria...");
    }

    void come (){
        System.out.println(Gato.nome + " está comendo!");
    }

    void bebe (){
        System.out.println(Gato.nome + " está bebendo leite. Que gracinha!");
    }

    public static String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        Gato.cor = cor;
    }

    public static String getNome() {
        return nome;
    }

    public static void setNome(String nome) {
        Gato.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public boolean isPelo() {
        return pelo;
    }

    public void setPelo(boolean pelo) {
        this.pelo = pelo;
    }

    public boolean isRabo() {
        return rabo;
    }

    public void setRabo(boolean rabo) {
        this.rabo = rabo;
    }
}
