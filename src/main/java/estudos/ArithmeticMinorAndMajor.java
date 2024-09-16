package estudos;

import java.util.Scanner;

public class ArithmeticMinorAndMajor {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int value1;
        int value2;
        int value3;

        System.out.println("insert value1: ");
        value1 = input.nextInt();

        System.out.println("insert value2: ");
        value2 = input.nextInt();

        System.out.println("insert value3: ");
        value3 = input.nextInt();

        int sum;
        int average; // média
        int product;

        sum = value1 + value2 + value3;
        System.out.printf("sum = %d%n" , sum);

        average = sum / 3;
        System.out.printf("média = %d%n" , average);

        product = value1 * value2 * value3;
        System.out.printf("product = %d%n" , product);

        // variaveis
        int maior = value1;
        int menor = value1;

        // verificar número maior
        if (maior < value2){
            maior = value2;
        }

        if (maior < value3){
            maior = value3;
        }

        // verificar número menor
        if (menor > value2){
            menor = value2;
        }

        if (menor > value3){
            menor = value3;
        }

        System.out.printf("maior: %d%n" , maior);
        System.out.printf("menor: %d%n" , menor);


    }
}
