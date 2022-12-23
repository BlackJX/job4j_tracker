package ru.job4j.poly;

public class PolyUsage {
    public static void main(String[] args) {
        Vehicle airplane = new Airplane();
        Vehicle newBus = new NewBus();
        Vehicle train = new Train();

        Vehicle[] vehicles = new Vehicle[] {airplane, newBus, train};
        for (Vehicle a : vehicles) {
            a.move();
        }
    }
}