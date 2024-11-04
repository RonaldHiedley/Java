package estudos.cap1a2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ImparOuPar {
//    Escreva um aplicativo que leia um inteiro, além de determinar e imprimjr
//    se ele é impar ou par.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int valor;

        System.out.println("insert new valor int: ");
        valor = input.nextInt();

//        Um numero par e um multiplo de 2. Qualquer multiplo de 2 deixa o resto 0 quando dividido por 2.

//        int resultado = valor / 2;

//        O operador % retorna o resto de uma divisao. Por exemplo:
//        10 % 2 resultado em 0, pois 10 divido por 2 e 5 e o resto e 0.
//        11 % 2 resultado em 1, pois 11 divido por 2 e 5 (5,5 com resto) e o resto e 1.
        if (valor % 2 == 0){
            System.out.println(" O numero"+ valor +" e par.");
        } else {
            System.out.println(" O numero "+ valor +" e impar");
        }


    }



}
