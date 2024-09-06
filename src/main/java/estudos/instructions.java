package estudos;

import java.util.ArrayList;
import java.util.Scanner;

public class instructions {
    public static void main(String[] args) {

        //Scanner input = new Scanner(System.in);e

        //int here;
        //System.out.print("\"here\" number :");
        //here = input.nextInt();
        //System.out.printf("%d", here);

        int x = 2;
        int y = 3;
        System.out.printf("x = %d%n", x);
        System.out.printf("Value of %d + %d is %d%n", x, x, (x +x));
        System.out.printf("x =");
        System.out.printf("%d = %d%n", (x + y), (y + x));
        //int[] idaes;
        //idades[0] = 22;

        // Uma forma!
        //int[] idades = {2,3,4};
        //idades[0] = 4;
        // Outra forma.
        // Vetores!:

        //int[] idades = new int[10];
        String[] nomes = new String[10];
        //boolean[] sapBrasileiros = new boolean[10];
        boolean[] sapBrasileiros = new boolean[10];

        //int[] idades1 = new int[10];
        //idades1.length;

        int[] idades1 = new int[10];
        ArrayList<Integer> idades = new ArrayList<Integer>();
        idades.add(22);
        idades.add(50);
        idades.add(30);
        idades.remove(0);
        idades.get(1);
        idades.size();


        //Loops while e for
        //for
        int anos = 10;
        for(var i = 0; i < anos; i++){
            System.out.println("oi");
        }

        //while
        int i = 0;
        while(i < anos){
            i++;
        }

        //casting
        // no java a dois tipos de casting o explicito e o implicito
        int idade7 = 22;
        double idade8 = idade7;

        // erro! idade7 = idade8;
        idade7 = (int) idade8;

        char letra = 'a';
        String nome = String.valueOf(letra);
        letra = nome.charAt(0);
        //inteiro em uma String
        String nome2= String.valueOf(idade7);
        //STRING EM UM INTEIRO. Não é sempre que vai dá para nos fazermos isso!
        idade7 = Integer.parseInt(nome2);

    }
}















