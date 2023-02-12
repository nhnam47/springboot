package com.example.demo.pattern.creationalpattern.factorymethod.logistics;

public class TruckTransport implements Transport {

    @Override
    public String deliver() {
        return "Deliver by land in a box.";
    }
}
