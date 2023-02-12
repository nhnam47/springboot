package com.example.demo.pattern.creationalpattern.factorymethod.bank;

public class Client {
    public static void main(String[] args) {
        Bank bank = BankFactory.getBank(BankType.VIETCOMBANK);
        System.out.println(bank.getBankName());
    }
}
