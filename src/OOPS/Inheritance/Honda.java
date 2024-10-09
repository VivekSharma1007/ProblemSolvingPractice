package OOPS.Inheritance;

public class Honda extends Car{

    public Honda() {
        super(); // this call will be added be java itself internally
        System.out.println("in honda default constructor");
    }

    @Override
    public int getSpeed() {
        System.out.println("overridden method of car class");
        return super.getSpeed() + 10;
    }

    public void myMethod() {
        System.out.println("in honda my method");
    }


    @Override
    public void noOfDoors() {
        System.out.println("no of doors " + 2);

    }

    // different method signatures
    // number of params
    // data type of params
    // sequence of params
    // diff return type with different params
    public void noOfDoors(int number) {
        System.out.println("no of doors " + number);
    }


}
