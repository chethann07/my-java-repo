package concepts.Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListDemo {
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static void main(String[] args) {
        // ArrayList declaration
        ArrayList al = new ArrayList();

        // Can store heterogeneous and homogeneous values
        // al.add(10);
        // al.add("Hello");
        // al.add(null);
        // al.add(new Thread());

        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);

        // To add the data at a specifc position
        // al.add(1, 15);

        // To add a array list to another arraylist
        // ArrayList al2 = new ArrayList();

        // al2.add(100);
        // al2.add(200);
        // al2.add(300);
        // al2.add(400);
        // al.addAll(al2);
        // al.addAll(2, al2);

        // To remove all the duplicates that are present in another array list
        // al.removeAll(al2);

        // To retain all the elements that are present in another array list
        // al.retainAll(al2);

        // To remove an element from arraylist
        // al.remove(2);

        // To get an element from arraylist
        // al.get(2);

        // To set an element by deleting the previous element
        al.set(1, 18);

        // To check wheather an element exists
        al.contains(10);

        // To check if a arraylist is empty or not
        al.isEmpty();

        // To return the size of the arraylist
        al.size();

        // Accessing the arraylist

        // 1. for() loop
        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));
        }

        // 2. Advance for() loop
        for (Object object : al) {
            System.out.println(object);
        }

        // 3. Iterator
        Iterator itr = al.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // 4. List Iterator
        ListIterator litr = al.listIterator(al.size());
        while (litr.hasPrevious()) {
            System.out.println(litr.previous());
        }
    }
}