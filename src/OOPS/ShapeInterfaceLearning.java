package OOPS;

interface Shape {


    // by default public static final
    int length = 10;

    // by default methods are public and abstract
    void shapeType();


    // java 8 features
    // default methods with definition
    // we can override this method
    default void shapeMethod() {
        System.out.println("default method of interface with definition");
    }

    // static methods
    // by default public
    // these methods are not inherited
    static void callMethod() {
        System.out.println("static call method");
    }

    // after java 9 we can define private methods in interfaces
    // these methods will not be implemented or extended in other interfaces
    private void privateMethod() {
        System.out.println("private method of interface");
    }

    // these methods will only be used for improving code reusability
    private static void privateStaticMethods() {
        System.out.println("private static methods of interfaces");
    }
}

class Rect implements Shape {

    int length;

    // must mention public here otherwise weak assignment error will come --- we can not reduce visibility of the
    // access modifier
    @Override
     public void shapeType() {
        System.out.println("Rectangle");
    }

    @Override
    public void shapeMethod() {
        System.out.println("overridden method of default method from interface");
    }
}

public class ShapeInterfaceLearning {

    public static void main(String[] args) {
        Rect rect = new Rect();
        rect.shapeType();
        rect.length = 30;
        System.out.println(rect.length);
        rect.shapeMethod();

        Shape shape = new Rect();
        shape.shapeType();
        System.out.println(shape.length);
        shape.shapeMethod();

        Shape.callMethod();

    }
}
