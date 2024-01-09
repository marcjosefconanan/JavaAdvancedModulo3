//Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
//Crea un secondo oggetto data da questa stringa 2024-03-01T13:00:00Z
//Verificare che la prima data è precedente alla seconda
//Verificare che la seconda data è successiva alla prima
//Verificare che le due date sono uguali ad ora
//Stampa il risultato

import java.time.OffsetDateTime;

public class Main {
    public static void main(String[] args) {
        OffsetDateTime firstDate = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        OffsetDateTime secondDate = OffsetDateTime.parse("2024-03-01T13:00:00Z");

        boolean verifyIfBefore = firstDate.isBefore(secondDate);
        System.out.println("the first date is before the second date " + verifyIfBefore);
        //Verifica che la prima data è precedente alla seconda

        boolean verifyIfAfter = secondDate.isAfter(firstDate);
        System.out.println("the second date is after the first date " + verifyIfAfter) ;
        //Verifica che la seconda data è successiva alla prima

        boolean verefyIfEqual = firstDate.isEqual(secondDate);
        System.out.println("the first and second date are equal " + verefyIfEqual);
        //Verifica che le due date sono uguali ad ora

    }
}
