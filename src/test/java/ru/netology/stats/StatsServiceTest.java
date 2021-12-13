package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void shouldCalculateSum() {
        StatsService service = new StatsService();
        int[] manageSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = service.calculateSum(manageSales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldFindAverage() {
        StatsService service = new StatsService();
        int[] manageSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = service.findAverage(manageSales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldMaxSales() {
        StatsService service = new StatsService();
        int[] manageSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.maxSales(manageSales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldMinSales() {
        StatsService service = new StatsService();
        int[] manageSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.minSales(manageSales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldBellowAverage() {
        StatsService service = new StatsService();
        int[] manageSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.bellowAverage(manageSales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldAboveAverage() {
        StatsService service = new StatsService();
        int[] manageSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.aboveAverage(manageSales);
        assertEquals(expected, actual);
    }
}