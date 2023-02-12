package com.example.demo.pattern.creationalpattern.factorymethod.logistics;

public class TrainTransport implements Transport{
    @Override
    public String deliver() {
        return "Deliver by train.";
    }
}
