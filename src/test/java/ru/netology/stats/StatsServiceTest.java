package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    //  1. Сумма всех продаж.
    public void shouldCalcSum() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSum = 180;
        int actualSum = service.calcSum(sales);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    //2. Средняя сумма продаж в месяц.
    public void shouldCalcAverage() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        double expectedAverage = 15;
        double actualAverage = service.calcAverage(sales);

        Assertions.assertEquals(expectedAverage, actualAverage);
    }


    @Test
    //3. Номер месяца, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму
    public void shouldNumberMaxSalesMonth() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonth = 8;
        int actualMonth = service.maxSales(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    //4. Номер месяца, в котором был минимум продаж, то есть осуществлены продажи на минимальную сумму
    public void shouldNumberMinSalesMonth() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonth = 9;
        int actualMonth = service.minSales(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    //5. Количество месяцев, в которых продажи были ниже среднего
    public void shouldSumUnderAverageMonth() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonth = 5;
        int actualMonth = service.monthUnderAverage(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    //6. Количество месяцев, в которых продажи были выше среднего
    public void shouldSumAboveAverageMonth() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonth = 5;
        int actualMonth = service.monthAboveAverage(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

}