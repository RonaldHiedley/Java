package estudos;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number1;
        int number2;
        int number3;
        int result;

        System.out.print("insert number one: ");
        number1 = input.nextInt();

        System.out.print("insert number second: ");
        number2 = input.nextInt();

        System.out.print("insert number tree: ");
        number3 = input.nextInt();

        result = number1 + number2 + number3;
        System.out.printf("sum is %d", result);
    }
}
