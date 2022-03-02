package Iterator;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ExternalIteratorDemo {
    public static void main(String[] args) {
        List<String> names = new LinkedList<>();
        names.add("Rams");
        names.add("Posa");
        names.add("Chinni");

        // Getting Iterator
        Iterator<String> namesIterator = names.iterator();

        while (namesIterator.hasNext()) {
            System.out.println(namesIterator.next());
        }

        // Getting foreach - в основе лежит Iterator
        for (String name : names) {
            System.out.println(name);
        }

    }
}
