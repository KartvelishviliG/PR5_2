package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WorkRestServiceTest {

    @Test
    void shouldCalculateTwoMonthsRest() {
        WorkRestService service = new WorkRestService();

        int income = 100_000;
        int expenses = 60_000;
        int threshold = 150_000;
        int expectedRestMonths = 2;

        int actualRestMonths = service.calculateRestMonths(income, expenses, threshold);

        Assertions.assertEquals(expectedRestMonths, actualRestMonths);
    }

    @Test
    void shouldCalculateThreeMonthsRest() {
        WorkRestService service = new WorkRestService();

        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;
        int expectedRestMonths = 3;

        int actualRestMonths = service.calculateRestMonths(income, expenses, threshold);

        Assertions.assertEquals(expectedRestMonths, actualRestMonths);
    }
}
