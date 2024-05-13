package ru.netology.services;

public class WorkRestService {
    public int calculateRestMonths(int income, int expenses, int threshold) {
        int restMonthsCount = 0;
        int currentMoney = 0;

        for (int month = 1; month <= 12; month++) {
            if (currentMoney >= threshold) {
                currentMoney -= expenses;
                // После вычета расходов оставшуюся сумму делим на 3, так как траты на отдых
                currentMoney /= 3;  // Верный расчет уменьшения средств после отдыха
                restMonthsCount++;
            } else {
                currentMoney += (income - expenses);
            }
        }
        return restMonthsCount;
    }
}