package com.bookcatalogue.main.java.model;

public class Price {
    private final int value;
    private final CurrencyType currencyType;

    public Price(int value,CurrencyType currencyType) {
        this.value = value;
        this.currencyType = currencyType;
    }

    public int getValue() {
        return value;
    }

    public CurrencyType getCurrencyType() {
        return currencyType;
    }
}
