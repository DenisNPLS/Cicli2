package ru.netology.stats;

public class StaticService {

    public int sum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum = sum + sale;
        }
        return sum;
    }

    public int avarageAmount(int[] sales) {
        int avarageAmount = 0;
        for (int sale : sales) {
            avarageAmount = avarageAmount + sale;
        }
        return avarageAmount / 12;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month++;
        }
        return maxMonth + 1;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month++;
        }
        return minMonth + 1;
    }

    public int underCount(int[] sales) {
        int underAvarage = 0;
        for (int sale : sales) {
            underAvarage = underAvarage + sale;
        }
        int underCount = 0;
        for (int sale : sales) {
            if (sale < underAvarage / 12) {
                underCount++;
            }
        }
        return underCount;
    }

    public int overCount(int[] sales) {
        int overAvarage = 0;
        for (int sale : sales) {
            overAvarage = overAvarage + sale;
        }
        int overCount = 0;
        for (int sale : sales) {
            if (sale > overAvarage / 12) {
                overCount++;
            }
        }
        return overCount;
    }
}
