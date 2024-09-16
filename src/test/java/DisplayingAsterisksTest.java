import java.util.Arrays;

public class DisplayingAsterisksTest {

    // Esse Teste foi com pesquisa e sem usar printf
    public static void main(String[] args) {
        // Criando as linhas das formas
        String[] caixa = {
                "**********",
                "**********",
                "**********",
                "**********",
                "**********"
        };

        String[] elipse = {
                "   ***   ",
                " *     * ",
                "*       *",
                " *     * ",
                "   ***   "
        };

        String[] seta = {
                "    *    ",
                "   ***   ",
                "  *****  ",
                "    *    ",
                "    *    ",
                "    *    "
        };

        String[] losango = {
                "    *    ",
                "   * *   ",
                "  *   *  ",
                " *     * ",
                "  *   *  ",
                "   * *   ",
                "    *    "
        };

        // Calcular a maior quantidade de linhas entre as formas
        int maxLinhas = Math.max(Math.max(caixa.length, elipse.length), Math.max(seta.length, losango.length));

        // Imprime todas as formas lado a lado
        for (int i = 0; i < maxLinhas; i++) {
            // Imprime cada linha das formas. Se a forma nãp tiver essa linha, imprime espaços.
            if (i < caixa.length) {
                System.out.print(caixa[i] + "  "); // Caixa
            } else {
                System.out.print("        "); // Espaços no lugar da caixa
            }

            if (i < elipse.length) {
                System.out.print(elipse[i] + "  "); // Elipse
            } else {
                System.out.print("         "); // Espalços no lugar da elipse
            }

            if (i < seta.length) {
                System.out.print(seta[i] + "   "); // Seta
            } else {
                System.out.print("         "); // Espaços no lugar da seta
            }

            if (i < losango.length) {
                System.out.print(losango[i]); // Losango
            } else {
                System.out.print("          "); // Espaços do Losango
            }

            System.out.println(); // Salta para a próxima linha
        }

        System.out.printf("*%n**%n***%n****%n*****%n");
        System.out.println("*");
        System.out.println("***");
        System.out.println("*****");
        System.out.println("****");
        System.out.println("**");
        System.out.print("*");
        System.out.print("***");
        System.out.print("*****");
        System.out.print("****");
        System.out.println("**");
        System.out.print("*");

        System.out.println("***");
        System.out.println("*****");
        System.out.print("****");
        System.out.println("**");
    }
}
