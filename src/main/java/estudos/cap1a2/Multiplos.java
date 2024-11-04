package estudos.cap1a2;

import java.util.Scanner;

public class Multiplos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int inteiro1;
        int inteiro2;

        System.out.printf("insert fast int:");
        inteiro1 = input.nextInt();

        System.out.printf("ínsert last int");
        inteiro2 = input.nextInt();

        if (inteiro1 % inteiro2 == 0) {
            System.out.println("the fast int is multiplo for last int");
        } else {
            System.out.println("no multiplo_");
        }

//        Deu certo \0/

    }
}
