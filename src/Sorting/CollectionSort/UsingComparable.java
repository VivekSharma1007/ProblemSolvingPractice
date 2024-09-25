package Sorting.CollectionSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UsingComparable {
    public static void main(String[] args) {

        // primitive wrapper class sorting done by java itself
       /* List<Integer> list = new ArrayList<>();
        list.add(10); list.add(30); list.add(4); list.add(2); list.add(34); list.add(8);
        System.out.println(list);

        Collections.sort(list); // will use comparable's compareTo method
        System.out.println(list);   */

        /*
        List<Student> students = new ArrayList<>();
        students.add(new Student(7, "Vivek"));
        students.add(new Student(20, "Vaibhav"));
        students.add(new Student(15, "Binny"));
        students.add(new Student(5, "Manasvi"));

        Collections.sort(students);
        System.out.println(students); */

        List<String> strlist = new ArrayList<>();
        strlist.add("Johny");
        strlist.add("Jack");
        strlist.add("John");
        strlist.add("Jill");

        Collections.sort(strlist);
        System.out.println(strlist);

    }
}

// when we want to give power of comparison to the class itself
class Student implements Comparable<Student> {
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

  /*  @Override         // on the basis of id
    public int compareTo(Student o) {
        // this > o = +ve
        // this < o = -ve
        // this == o = 0
        return this.id - o.id;  // natural sorting
       // return o.id - this.id; // reverse order
    }   */

    // on the basis of name
    @Override
    public int compareTo(Student o) {
        return this.name.compareToIgnoreCase(o.name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
