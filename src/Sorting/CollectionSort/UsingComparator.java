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
//        Collections.sort(users, comp);
//        System.out.println(users);

        Comparator<User> c1 = (o1, o2) -> o1.name.compareToIgnoreCase(o2.name);
        Collections.sort(users, c1);
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

    @Override
    public int compare(User o1, User o2) {
        return o1.id - o2.id;
    }
}
