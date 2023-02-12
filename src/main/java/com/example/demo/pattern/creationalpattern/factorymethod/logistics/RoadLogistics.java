package com.example.demo.pattern.creationalpattern.factorymethod.logistics;

public class RoadLogistics {

    public TruckTransport truckTransport() {
        return new TruckTransport();
    }

    public TrainTransport trainTransport() {
        return new TrainTransport();
    }
}
