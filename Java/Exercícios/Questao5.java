import java.util.Arrays;
import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        String[] promoFrutas = { "banana", "maçã", "abacaxi", "melão", "mamão" };
        System.out.println("=== Bem-vindo ao Hortifruti Java ===");
        Scanner input = new Scanner(System.in);

        String[] frutasEmPromocao = metodoUm(promoFrutas, input);

        System.out.println("Você comprou as seguintes frutas em promoção: " + Arrays.toString(frutasEmPromocao));
        System.out.println("Portanto, receberá um desconto de " + frutasEmPromocao.length * 5 + "%.");

    }

    private static String[] metodoUm(String[] promoFrutas, Scanner input) {
        System.out.println("Informe sua lista de compras separando por vírgulas. Exemplo: banana,uva.");
        String compra = input.nextLine();
        String[] listaCompra = compra.split(",");
        String[] frutasEmPromocao = new String[listaCompra.length];
        int cont = 0;
        for (String fruta : listaCompra) {
            for (String promoFruta : promoFrutas) {
                if (promoFruta.equalsIgnoreCase(fruta)) {
                    frutasEmPromocao[cont++] = fruta;
                    break;
                }
            }
        }
        return frutasEmPromocao;
    }
}
