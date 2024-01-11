//Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
//Ottieni l'anno
//Ottieni il mese
//Ottieni il giorno
//Ottieni il giorno della settimana
//Stampa i risultati sulla console -Crea dei test per questo esercizio
import java.time.OffsetDateTime;

public class Main {
    public static void main(String[] args) {
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        String year = String.valueOf(data.getYear());
        System.out.println("print Year: " + year);
        // questo dà l'anno

        String month = String.valueOf(data.getMonth());
        System.out.println("print Month: " + month);
        // questo dà il mese

        String dayOfYear = String.valueOf(data.getDayOfYear());
        System.out.println("Print day of the year: " + dayOfYear);
        // questo dà il giorno del anno

        String dayOfMonth = String.valueOf(data.getDayOfMonth());
        System.out.println("print day of the Month: " + dayOfMonth);
        // questo dà il giorno del mese

        String dayOfWeek = String.valueOf(data.getDayOfWeek());
        System.out.println("Print day of the week: " + dayOfWeek);
        // questo dà il giorno della settimana

    }
}
