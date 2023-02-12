package com.example.demo.pattern.creationalpattern.factorymethod.logistics;

public class Logistics {

    public static void main(String[] args) {
        RoadLogistics truckLogistics = new RoadLogistics();
        System.out.println(truckLogistics.truckTransport().deliver());

        RoadLogistics train = new RoadLogistics();
        System.out.println(train.trainTransport().deliver());


        SeaLogistics seaLogistics = new SeaLogistics();
        System.out.println(seaLogistics.shipTransport().deliver());
    }
}
