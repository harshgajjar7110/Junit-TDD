import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class leapYearTest {

    private final leapYear leapYear = new leapYear();


    @Test
    public void leapYearTestOne() {

        assertEquals(true, leapYear.isLeapYear(2016));
        assertEquals(false, leapYear.isLeapYear(2017));
        assertEquals(false, leapYear.isLeapYear(2018));
    }


}
