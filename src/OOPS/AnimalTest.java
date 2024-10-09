package OOPS;

abstract class Animal {

    // can be static, non-static, final, non-final
    // all 4 access modifier allowed
    public String name;

    Animal() {
        System.out.println("in animal default constructor");
    }


    // why need constructor
    // if we are instantiating the object of the class which is extending this abstract class
    // using parameterized constructor then to make sure the object is instantiated properly we have to create
    // constructor
    Animal(String name) {
        this.name = name;
    }

    // can have abstract and concrete methods
    // can not instantiate its object/ can not create object
    abstract void makeSound();
    void intro() {
        System.out.println("this is animal class");
    }

    // can create static methods... used to call by using class name only
    public static void callClass() {
        System.out.println("Calling class Animal");
    }

    // no possible this below method ... illegal combination of access modifiers
    // public static abstract void call();

    // final method is possible
    // can not declare final abstract method as we can not override final methods
    public final void finalMethod() {
        System.out.println("animal final method");
    }
}

class Dog extends Animal {

    String name;

    Dog() {
        System.out.println("in default dog constructor");
    }

    Dog(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public void makeSound() {
        System.out.println("Bark");
    }

    @Override
    public void intro() {
        System.out.println("in dog");
    }


}

public class AnimalTest{
    public static void main(String[] args) {
//        Dog dog = new Dog();
//        dog.makeSound();
//        dog.intro();

        Animal animal = new Dog();
        animal.makeSound();
        animal.intro();
        Animal.callClass();
//        animal.name  = "name is animal";
//        System.out.println(animal.name);


        Animal dog2 = new Dog("Tony");
        System.out.println(dog2.name);
    }
}
