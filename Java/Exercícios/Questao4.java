import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        String[] promoDeFrutas = {"Abacaxi", "Banana", "Maçã", "Mamão", "Melão"};
        System.out.println("Qual fruta você deseja comprar hoje?");
        Scanner input = new Scanner(System.in);
        String frutaInput = input.nextLine();
        boolean frutaEmPromo = false;
        
        input.close();

        for (String promoDeFruta : promoDeFrutas) {
            if (promoDeFruta.equalsIgnoreCase(frutaInput));
            frutaEmPromo = true;
            break;
        }

        if (frutaEmPromo) {
            System.out.println("Essa fruta está em promoção!");
        } else {
            System.out.println("Essa fruta não está em promoção.");
        }
    }
}