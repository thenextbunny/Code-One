import java.util.Arrays;
import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        String[] frutas = new String[5];
        System.out.println("Insira a sua lista de compras de frutas: ");
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            frutas[i] = input.nextLine();
            
        }

        input.close();
        
        System.out.println("As frutas do seu carrinho são: ");
        Arrays.sort(frutas);
        System.out.println(Arrays.toString(frutas));
    }
}