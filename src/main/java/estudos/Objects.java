package estudos;

import org.example.Main;

public class Objects {
    //testando algumas coisas
    String nome;

    static String nome2;

    public static void main(String[] args) {
        System.out.println(nome2);
    }

    static void teste(){

    }

    void declaraNome(){
        System.out.println(nome2);
        //erro?! Main.teste();
        nome = "Ronald";

        Main meuMain = new Main();
        //System.out.println(meuMain.nome);
        //meuMain.declaraNome();
    }

    String getNome(){
        return nome;
    }
}















