package OOPS.Inheritance;

public class Demo {

    // child class know the methods of its parent class but the parent is unaware about that
    public static void main(String[] args) {
        // this will call parent's default constructor also
        // it will go to the honda default constructor
        // then there is default call for Car(parent class) default constructor
        // for this constructor to exist we must have default constructor in our parent class
        // same will happen for parameterized constructor
        Honda honda = new Honda();

        honda.company = "Honda";
        honda.model = "Amaze";

        System.out.println(honda.company + ", " + honda.model);

        honda.myMethod();
        honda.info();

        // here honda has inherited the methods also from its parent class which is Car
        honda.setSpeed(100);
        // after overriding the getSpeed method the returned speed will be 110
        System.out.println("honda override getSpeed " + honda.getSpeed());


        Car car = new Car();
        // here car do not about its child class myMethod
        // car.myMethod() -- not present

        car.setSpeed(100);
        System.out.println("car getSpeed " + car.getSpeed());

        // this below case is also not possible
        // we have to define myMethod in car class first then ref hondaCar will be able to access that method
        Car hondaCar = new Honda();
        // hondaCar.myMethod();

        hondaCar.setSpeed(100);
        // this is run time polymorphism
        System.out.println("hondaCar speed " + hondaCar.getSpeed());

        System.out.println(car.model);


        // overriding
        honda.noOfDoors();
        car.noOfDoors();
        // overloading
        honda.noOfDoors(4);

    }
}
