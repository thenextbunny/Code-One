public class aula4p2 {
    public static void main(String[] args) {
        int nota = 7;

        // Verificando nota com base em conceitos
        if (nota >= 80) {
            System.out.println("Conceito A");
        } else if (nota >= 70) {
            System.out.println("Conceito B");
        } else if (nota >= 60) {
            System.out.println("Conceito C");
        } else if (nota >= 0) {
            System.out.println("Conceito D");
        } else {
            System.out.println("Nota inválida!");
        }
    }
}