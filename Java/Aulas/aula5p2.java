import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
import java.time.LocalDateTime;

public class aula5p2 {
    public static void main(String[] args) {
        // Olá, {nome}. Hoje é {dia da semana}, {saudacao}
        String nome = "Lucas";

        // ISO 8601
        LocalDate hoje = LocalDate.now();

        //System.out.println(hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, new Locale("pt", "BR")));

        String diaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, new Locale("pt", "BR"));

        String saudacao;

        LocalDateTime agora = LocalDateTime.now();

        if(agora.getHour() >= 0 && agora.getHour() <12) {
            saudacao = "bom dia";
        } else if (agora.getHour() >= 12 && agora.getHour() < 18) {
            saudacao = "boa tarde.";
        } else if (agora.getHour() >= 18 && agora.getHour() < 24) {
            saudacao = "boa noite";
        } else {
            saudacao = ":)";
        }
        
        System.out.printf("Olá, %s. Hoje é %s, %s.%n", nome, diaSemana, saudacao.toUpperCase());
    }
}
