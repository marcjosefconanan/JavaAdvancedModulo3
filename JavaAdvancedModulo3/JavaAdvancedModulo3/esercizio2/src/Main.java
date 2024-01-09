//Crea un oggetto OffsetDateTime da questa stringa 2023-03-01T13:00:00Z
//Formatta la data ottenendo 01 marzo 2023
//Stampa sulla console

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

/*
import java.time.DateTimeException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
    public static void main(String[] args) {

        String dateToParse = "2023-03-01T13:00:00Z";
        String pattern = "dd MMMM yyyy";
        OffsetDateTime parsedDate = parseDate(dateToParse);
        String patternDateString = convertUsingOfPattern(parsedDate, pattern );

        System.out.println("Date to parse = " + dateToParse);
        System.out.println("Pattern = " + pattern);
        System.out.println("Parsed date = " + parsedDate);
        System.out.println("Formatted date using ofPattern = " + patternDateString);
    }

    public static OffsetDateTime parseDate(String dateToParse) {
        if (dateToParse != null) {
            return OffsetDateTime.parse(dateToParse);
        }
        else {
            throw new DateTimeException("Passed a null value that cannot be parsed");
        }
    }

    //
    public static String convertUsingOfPattern(OffsetDateTime date, String pattern) {
        if (date == null) {
            throw new DateTimeException("Passed date is null and cannot be formatted");
        } else if (pattern == null) {
            throw new NullPointerException("Provided pattern is null and cannot be used to format a date");
        } else {
            //Throws: IllegalArgumentException – if the pattern is invalid
            return date.format(DateTimeFormatter.ofPattern(pattern));
        }
    }
}
*/