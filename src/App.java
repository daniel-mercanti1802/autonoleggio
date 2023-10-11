import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class App {
    public static void App(String[] args) throws Exception {
public static void App (String[] args) {
        // Otteniamo la data corrente utilizzando la classe LocalDate
        LocalDate dataCorrente = LocalDate.now();
        System.out.println("Data corrente: " + dataCorrente);

        // Otteniamo l'orario corrente utilizzando la classe LocalTime
        LocalTime orarioCorrente = LocalTime.now();
        System.out.println("Orario corrente: " + orarioCorrente);

        // Otteniamo la data e l'orario correnti utilizzando la classe LocalDateTime
        LocalDateTime dataOraCorrenti = LocalDateTime.now();
        System.out.println("Data e orario correnti: " + dataOraCorrenti);
        
        // Utilizziamo il metodo get per ottenere parti specifiche della data e dell'orario
        int anno = dataCorrente.getYear();
        int mese = dataCorrente.getMonthValue();
        int giorno = dataCorrente.getDayOfMonth();
        int ora = orarioCorrente.getHour();
        int minuto = orarioCorrente.getMinute();
        int secondo = orarioCorrente.getSecond();
        
        System.out.println("Anno: " + anno);
        System.out.println("Mese: " + mese);
        System.out.println("Giorno: " + giorno);
        System.out.println("Ora: " + ora);
        System.out.println("Minuto: " + minuto);
        System.out.println("Secondo: " + secondo);
        
        // Utilizziamo il metodo with per modificare parti specifiche della data e dell'orario
        LocalDate dataModificata = dataCorrente.withYear(2024);
        LocalTime orarioModificato = orarioCorrente.withHour(15).withMinute(30);
        System.out.println("Data modificata: " + dataModificata);
        System.out.println("Orario modificato: " + orarioModificato);
        
        // Utilizziamo il metodo plus per aggiungere una certa quantità di tempo
        LocalDate dataFutura = dataCorrente.plusDays(7);
        LocalTime orarioFuturo = orarioCorrente.plusHours(2).plusMinutes(15);
        System.out.println("Data futura: " + dataFutura);
        System.out.println("Orario futuro: " + orarioFuturo);
    }
}

    }
}
