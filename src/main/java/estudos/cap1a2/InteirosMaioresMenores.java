package estudos.cap1a2;

import java.util.Scanner;

public class InteirosMaioresMenores {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        Leitura do primeiro número
        System.out.print("Digite o 1º");
        int numero1 = input.nextInt();
        int maior = numero1;
        int menor = numero1;

//        Leitura e comparação do segundo número
        System.out.print("Digite o 2º número: ");
        int numero2 = input.nextInt();
        if (numero2 > maior) {
            maior = numero2;
        }
        if (numero2 < menor){
            menor = numero2;
        }

//      Leitura e comparação do terceiro número
    System.out.print("Digite o 3º número: ");
        int numero3 = input.nextInt();
        if (numero3 > maior){
            maior = numero3;
        }
        if (numero3 < menor) {
            menor = numero3;
        }

//        Leitura e comparação do quarto número
        System.out.print("Digite o $º número: ");
        int numero4 = input.nextInt();
        if (numero4 > maior) {
            maior = numero4;
        }
        if (numero4 < menor) {
            menor = numero4;
        }

//        Leitura e comparação do quinto número
        System.out.print("Digite o 5º número; ");
        int numero5 = input.nextInt();
        if (numero5 > maior) {
            maior = numero5;
        }
        if (numero5 < menor) {
            menor = numero5;
        }


//        Exibindo os resultados
        System.out.println("O maior número é: " + maior);
        System.out.println("O menor número é: " + menor);

        input.close();

    }
}











