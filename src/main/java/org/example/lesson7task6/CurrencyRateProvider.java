package org.example.lesson7task6;

public interface CurrencyRateProvider {
    double getBuyRate(Currency currency);

    double getSellRate(Currency currency);
}
