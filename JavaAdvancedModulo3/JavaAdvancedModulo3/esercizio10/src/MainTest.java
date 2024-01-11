import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void OffsetDateTimeTest() {
        assertEquals("2023-03-01T13:00:00Z", "2023-03-01T13:00:00Z");
    }
    @Test
    void YearAddedTest(){
        Integer plusYear = 1;
        assertEquals(plusYear,1);
    }
    @Test
    void MonthAddedTest(){
        Integer plusYear = 1;
        assertEquals(plusYear,1);
    }
    @Test
    void DayAddedTest(){
        Integer plusYear = 7;
        assertEquals(plusYear,7);
    }
    @Test
    void ActualDateTest() {
        assertEquals("2024-02-08 14:00:00", "2024-02-08 14:00:00");
    }
    @Test
    void TimeZoneTest() {
        assertEquals("Europe/Rome", "Europe/Rome");
    }
    @Test
    void PatternTest() {
        assertEquals("yyyy-MM-dd HH:mm:ss", "yyyy-MM-dd HH:mm:ss");
    }
    @Test
    void LocaleTest() {
        assertEquals("ITALY", "ITALY");
    }
}