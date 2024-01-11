//Riprendi uno degli esercizi già svolti e corretti
//Aggiungi Junit al progetto
//Crea una funzione di test che non dia errori
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
    public static void main(String[] args) {
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        System.out.println("Print pure data:" + data);

        String printLong = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
        System.out.println("Print Long" + printLong);
        // ho fatto LONG perchè darebbe il risultato che ci serve.
    }
}