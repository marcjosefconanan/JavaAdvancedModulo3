import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    //uno giusto
    @Test
    void DateTest() {
        assertEquals("2023-03-01T13:00:00Z", "2023-03-01T13:00:00Z");
    }
    //uno sbagliato
    @Test
    void DateTestMustBeLong() {
        assertEquals("01 march 2023", "01 mar 2023");
    }
}