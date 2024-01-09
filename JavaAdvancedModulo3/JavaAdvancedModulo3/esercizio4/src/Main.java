//Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
//aggiungi un anno
//sottrai un mese
//aggiungi 7 giorni
//Stampa il risultato localizzata per l'Italia

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        OffsetDateTime actualDate = data.plusYears(1).minusMonths(1).plusDays(7);
        // qui ho aggiunto un anno, un mese e sette giorni per farsi che concidi al tempo e data di oggi.

        actualDate = actualDate.atZoneSameInstant(java.time.ZoneId.of("Europe/Rome")).toOffsetDateTime();
        // questo identifica la zona del tempo che ci serve

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss", Locale.ITALY);
        String formattedDate = actualDate.format(formatter);
        // questo prende come vogliamo il format della data e il dove vogliamo il tempo locale

        System.out.println("Date: " + formattedDate);
        // questo stampa il la data formatto.
    }
}