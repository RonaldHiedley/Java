package estudos;

import java.util.Scanner;

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













