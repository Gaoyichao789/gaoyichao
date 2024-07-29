package com.Homework06;

public class Person {
    private String name;
    private Vehicles vehicles;

    public Person(String name, Vehicles vehicles) {
        this.name = name;
        this.vehicles = vehicles;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehicles getVehicles() {
        return vehicles;
    }

    public void setVehicles(Vehicles vehicles) {
        this.vehicles = vehicles;
    }

    public void passRiver(){
        Boat boat = VehiclesFactory.getBoat();
        boat.work();
    }
    public void common(){
        if(vehicles == null){
            vehicles = VehiclesFactory.getHorse();
        }
        vehicles.work();
    }
}
