package projcat;

public class Gato {
    String cor;
    static String nome;
    String raca;
    boolean pelo;
    boolean rabo;

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

}
