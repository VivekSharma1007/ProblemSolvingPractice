package Sorting.CollectionSort;

import java.net.CookieHandler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class UsingComparator {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User(7, "Vivek"));
        users.add(new User(20, "Vaibhav"));
        users.add(new User(15, "Binny"));
        users.add(new User(5, "Unknown"));
        users.add(new User(5, "Manasvi"));

        // one way
//        Collections.sort(users, new MyIdComparator());
//        System.out.println(users);

        // functional interface
     /*   Comparator<User> comp = new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.name.compareToIgnoreCase(o2.name);
            }
        };   */

        // another way
        // Collections.sort(users, comp);
        // System.out.println(users);

        // on the basis of name
        // Comparator<User> c1 = (o1, o2) -> o1.name.compareToIgnoreCase(o2.name);
        // Collections.sort(users, c1);
//        System.out.println(users);


        // for id = 5
        // we have 2 elements

        Comparator<User> comparator = Comparator.comparing(User::getId);
        Comparator<User> comparator1 = Comparator.comparing(User::getId).thenComparing(User::getName); // chaining of comparator
        Collections.sort(users, comparator1);
        System.out.println(users);

    }
}

class User {
    int id;
    String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

// when we want to create compare logic by ourself
class MyIdComparator implements Comparator<User> {

//    @Override
//    public int compare(User o1, User o2) {
//        return o1.id - o2.id;
//    }

    // when we have 2 or more id's with same value
    @Override
    public int compare(User o1, User o2) {
        int idComparison = o1.id - o2.id;

        if(idComparison == 0) {
            return o1.name.compareToIgnoreCase(o2.name);
        }
        return idComparison;
    }
}
