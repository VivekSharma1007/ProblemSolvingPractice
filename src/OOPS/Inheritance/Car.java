package OOPS.Inheritance;

public class Car {

    public String company;
    public String model;
    private int speed;

    public Car() {
        System.out.println("in car default constructor");
    }

    public Car(String company, String model) {
        System.out.println("in car parameterized constructor");
        this.company = company;
        this.model = model;
    }

    public void info() {
        System.out.println("company = " + company + ", " + "model = " + model);
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void noOfDoors() {
        System.out.println("you define no of doors");
    }

    @Override
    public String toString() {
        return "Car{" +
                "company='" + company + '\'' +
                ", model='" + model + '\'' +
                ", speed=" + speed +
                '}';
    }
}