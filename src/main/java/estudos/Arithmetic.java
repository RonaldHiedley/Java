package estudos;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Arithmetic {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int value1;
        int value2;
        int sum;
        int product;
        int diferenca;
        int quociente;
        System.out.printf("insira um valor: ");
        value1 = input.nextInt();

        System.out.printf("insira outro valor: ");
        value2 = input.nextInt();

        sum = value2 + value1;
        product = value2 * value1;
        diferenca = value2 - value1;
        quociente = value2 / value1;
        System.out.print("sum = " + sum + " product = " + product + " diferença = " +
                diferenca + " quociente = " + quociente);

//        System.out.println("");
    }
}
