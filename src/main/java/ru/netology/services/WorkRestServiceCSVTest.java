package ru.netology.services;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorkRestServiceCSVTest {
    @ParameterizedTest
    @CsvFileSource(resources = "/restCalculatorData.csv", numLinesToSkip = 1)
    void shouldCalculateRestMonthsCorrectly(int income, int expenses, int threshold, int expectedRestMonths) {
        WorkRestService service = new WorkRestService();
        int actualRestMonths = service.calculateRestMonths(income, expenses, threshold);
        assertEquals(expectedRestMonths, actualRestMonths);
    }
}
