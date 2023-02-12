package com.example.demo.pattern.creationalpattern.factorymethod.logistics;

public class ShipTransport implements Transport{
    @Override
    public String deliver() {
        return "Deliver by sea in a container.";
    }
}
