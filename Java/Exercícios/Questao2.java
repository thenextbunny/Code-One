import java.util.Scanner;

public class Questao2 {
    public static void main(String[] ags) {
        Scanner input = new Scanner (System.in);
        System.out.println("Informe um número entre 1 e 10: ");
        int numero = input.nextInt();

        for (int i = 0; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + numero * i);
        }

        input.close();
    }
}