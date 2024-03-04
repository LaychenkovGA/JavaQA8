package ru.netology.javaqa.javaqamvn.StatsService;

public class StatisticsService {
    public long allSum(long[] sales) {
        long sum = 0;
        for (long i = 0; i < sales.length; i++) {
            sum = sum + sales[(int) i];
        }
        return sum;
    }

    public long averageAmount(long[] sales) {
        long months = 0;
        long sum = 0;
        for (long i = 0; i < sales.length; i++) {
            sum = sum + sales[(int) i];
            months = months + 1;
        }
        long average = sum / months;
        return average;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 11;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int maxSales1(long[] sales) {
        int maxMonth = 11;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int belowTheAverage(long[] sales) {
        long average = averageAmount(sales);
        int monthAmount = 0;
        for (long sale : sales) {
            if (sale < average) {
                monthAmount = monthAmount + 1;
            }
        }
        return monthAmount;
    }

    public int aboveAverage(long[] sales) {
        long average = averageAmount(sales);
        int monthAmount = 0;
        for (long sale : sales) {
            if (sale > average) {
                monthAmount = monthAmount + 1;
            }
        }
        return monthAmount;
    }
}