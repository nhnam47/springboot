package com.example.demo.pattern.creationalpattern.factorymethod.bank;

public class BankFactory {
    public static final Bank getBank(BankType bankType) {
        switch (bankType) {
            case TPBANK:
                return new TPBank();
            case VIETCOMBANK:
                return new Vietcombank();
            default:
                throw new IllegalArgumentException("This bank type is unsupported");
        }

    }
}
