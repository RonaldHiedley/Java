package estudos;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x;
        int y;
        int z;
        int result;

        System.out.print("Insert first number: ");
        x = input.nextInt();

        System.out.print("Insert second number: ");
        y = input.nextInt();

        System.out.println("Insert tree number: ");
        z = input.nextInt();

        result = x + y + z;

        System.out.printf("Product is %d", result);
    }
}
