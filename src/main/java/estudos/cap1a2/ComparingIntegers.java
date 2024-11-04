package estudos.cap1a2;

import java.util.Scanner;

//Escreva um aplicativo que solicite ao usuário inserir dois inteiros, obtenha dele esses números e exiba o número
//maior seguido pelas palavras “is larger". Se os números forem iguais, imprima a mensagem “These numbers are equal". Utilize
//as técnicas mostradas na Figura 2.15.

public class ComparingIntegers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int value1;
        int value2;

        System.out.printf("insert value 1: " );
        value1 = input.nextInt();

        System.out.printf("insert value 2: " );
        value2 = input.nextInt();

        if ( value1 != value2) {
            System.out.println("is larger!");
        } else {
            System.out.println("These numbers are equal!");
        }

    }
}













