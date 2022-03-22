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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    //    @Override
//    public String toString() {
//        return "Car " + name + " max speed " + maxSpeed + " release year " + releaseYear;
//    }
}
