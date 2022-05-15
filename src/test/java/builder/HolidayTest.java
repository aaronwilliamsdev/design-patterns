package builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HolidayTest {
    @Test
    void holidayBuilderTest() {

       // given
        Holiday.Builder holidayBuilder = new Holiday.Builder();

        // when
       holidayBuilder.setArrival("01-01-2023")
                .setDestination("New York")
                .setResort("Coney Island Resort")
                .setDeparting("01-02-2023");
        Holiday holiday = holidayBuilder.build();

        // then
        assertEquals(holiday.toString(), "Your booking at Coney Island Resort in New York" +
                " is booked! You will stay 01-01-2023 to 01-02-2023");
    }
}