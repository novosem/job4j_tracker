package ru.job4j.poly;

public class Bus implements Transport{

    private int price;

    @Override
    public void drive() {
        System.out.println("Bus is moving.");
    }

    @Override
    public void passengers(int quantityOfPass) {
        int pass = quantityOfPass;
    }

    @Override
    public float refuel(int petrol) {
        return (float) (price * petrol);
    }
}
