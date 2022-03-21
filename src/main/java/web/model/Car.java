package web.model;

public class Car {

    private String name;
    private int maxSpeed;
    private int releaseYear;

    public Car(String name, int maxSpeed, int releaseYear) {
        this.name = name;
        this.maxSpeed = maxSpeed;
        this.releaseYear = releaseYear;
    }

    @Override
    public String toString() {
        return "Car " + name + " max speed " + maxSpeed + " release year " + releaseYear;
    }
}
