package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CollectionArrayList_Intuit {

    List l = Collections.synchronizedList(new ArrayList());

    public CollectionArrayList_Intuit() {
    }

    public static void main(String[] args) {
        CollectionArrayList_Intuit t = new CollectionArrayList_Intuit();

        ArrayList al = new ArrayList();

        al.add("First element");
        al.add("Second element");
        al.add("Third element");

        Iterator it = al.iterator();
        while (it.hasNext()) {
            System.out.println((String) it.next());
        }
        System.out.println("\n");

        al.add(2, "Insertion");
        it = al.iterator();
        while (it.hasNext()) {
            System.out.println((String) it.next());
        }
    }
}
