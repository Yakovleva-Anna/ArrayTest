
package ru.netology.stats;

public class StatsService {

    //  1. Сумма всех продаж.
    public int calcSum(int[] sales) {
        int sum = 0;
        for (int value : sales) {
            sum = sum + value;
        }
        return sum;
    }

    //2. Средняя сумма продаж в месяц.
    public double calcAverage(int[] sales) {
        return calcSum(sales) / sales.length;
    }

    //3. Номер месяца, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму
    public int maxSales(long[] sales) {
        int maxMonth = 0; // номер месяца с максимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) { // значит, в рассматриваемом i-м месяце продаж больше
                maxMonth = i; // запомним его как максимальный
            }
        }

        return maxMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    //4. Номер месяца, в котором был минимум продаж, то есть осуществлены продажи на минимальную сумму
    public int minSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    //5. Количество месяцев, в которых продажи были ниже среднего
    public int monthUnderAverage(int[] sales) {
        int count = 0;
        double salesAvg = calcAverage(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < salesAvg) {
                count++;
            }
        }
        return count;
    }

    //6. Количество месяцев, в которых продажи были выше среднего
    public int monthAboveAverage(int[] sales) {
        int count = 0;
        double salesAvg = calcAverage(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > salesAvg) {
                count++;
            }
        }
        return count;
    }

}