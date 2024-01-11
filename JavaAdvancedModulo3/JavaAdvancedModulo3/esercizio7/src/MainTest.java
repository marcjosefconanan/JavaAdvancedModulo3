import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    //tutti sbagliati
    @Test
    void TestOffsetDateTime() {
        assertEquals("2002-03-01T13:00:00Z","2003-03-01T13:00:00Z");
    }
    @Test
    void dateTestMustBeLong() {
        assertEquals("1 march 2002","1 march 2003");
    }
    @Test
    void dateTestMustBeMedium() {
        assertEquals("1 mar 2002","1 mar 2003");
    }
    @Test
    void dateTestMustBeShort() {
        assertEquals("01/03/2002","01/03/2003");
    }
    @Test
    void dateTestMustBeFull() {
        assertEquals("Friday, 1 March 2002","Friday, 1 March 2003");
    }
}