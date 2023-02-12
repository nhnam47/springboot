package com.example.demo.pattern.creationalpattern.factorymethod.logistics;

public class SeaLogistics {
    public ShipTransport shipTransport() {
        return new ShipTransport();
    }
}
