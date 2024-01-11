import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    //diversi tipi di assert e le loro funzionalità
    @Test
    void OffsetDateTimeTest() {
        assertEquals("2023-03-01T13:00:00Z", "2023-03-01T13:00:00Z");
    }
    @Test
    void DateTestMustBeTheCorrectYear() {
        assertNotEquals("2022", "2023");
        //questo vede se il expected e uguale al actual.
    }
    @Test
    void DateTestMustBeTheCorrectMonth() {
        assertFalse(true, "MARCH");
        //questo vede se la condizione e false, non lo è e lo è fa vedere il messagio MARCH.
    }
    @Test
    void DateTestMustBeTheCorrectDayOfYear() {
        assertNotNull("60", "60");
        // questo vede se non ci sono null.
    }
    @Test
    void DateTestMustBeTheCorrectDayOfMonth() {
        assertSame("1", "1");
        // qesto chiediamo a michele che ho provato a cercare ma mi fa "assertSame() uses the operator == to validate if two objects are equal"
        //che non capisco che vuoldire aiutoo michelee haha
    }
    @Test
    void DateTestMustBeTheCorrectDayOfWeek() {
        assertTrue(false, "WEDNESDAY");
        //quessto vede se la condizione e true, non lo è e lo è fa vedere il messagio WEDNESDAY
    }
}