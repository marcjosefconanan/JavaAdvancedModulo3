//Crea un oggetto OffsetDateTime da questa stringa 2002-03-01T13:00:00Z
//Formatta la data ottenuta in FULL, MEDIUM e SHORT
//Stampa le varie versioni -Crea dei test per questo esercizio
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
    public static void main(String[] args) {
        // questo e la sintassi per avere le date e ore
        OffsetDateTime data = OffsetDateTime.parse("2003-03-01T13:00:00Z");

        String printLong = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
        System.out.println("Print Long : " + printLong);
        // ne esce : 1 march 2002 questo e LONG format

        String printMedium = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
        System.out.println("Print Medium :" + printMedium);
        // ne esce : 1 mar 2002 questo e MEDIUM format

        String printShort = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
        System.out.println("Print Short :" + printShort);
        // ne esce 01/03/2002 questo e SHORT format

        String printFull = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
        System.out.println("Print Full :" + printFull);
        // Friday, 1 March 2002 questo e FULL format
    }
}