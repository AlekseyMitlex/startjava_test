package collection.intuit;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CollectionHashMap_Intuit {

    private static class TestObject {

        String text = "";

        public TestObject(String text) {
            this.text = text;
        }

        public String getText() {
            return this.text;
        }

        public void setText(String text) {
            this.text = text;
        }

        @Override
        public String toString() {
            return text;
        }
    }

    public CollectionHashMap_Intuit() {
    }

    public static void main(String[] args) {
        CollectionHashMap_Intuit collectionHashMapIntuit = new CollectionHashMap_Intuit();

        TestObject to = null;

        HashMap<String, Object> hm = new HashMap<>();

        hm.put("Key1", new TestObject("Value 1"));
        hm.put("Key2", new TestObject("Value 2"));
        hm.put("Key3", new TestObject("Value 3"));

        System.out.println("hm = " + hm);
        System.out.println("test = " + collectionHashMapIntuit);

        to = (TestObject) hm.get("Key1");
        System.out.println("Object value for Key1 = " + to.getText() + "\n");

        System.out.println("Iteration over entrySet");
        Map.Entry entry = null;
        Iterator it = hm.entrySet().iterator();
        // Итератор для перебора всех точек входа в Map
        while (it.hasNext()) {
            entry = (Map.Entry) it.next();
            System.out.println("For key = " + entry.getKey() +
                    " value = " + ((TestObject) entry.getValue()).getText());
        }

        System.out.println();
        System.out.println("Iteration over keySet");
        String key = "";
        // Итератор для перебора всех ключей в Map
        it = hm.keySet().iterator();
        while (it.hasNext()) {
            key = (String) it.next();
            System.out.println("For key = " + key + " value = " +
                    ((TestObject) hm.get(key)).getText());
        }

        // Заработало после переопределения toString
        for (Map.Entry<String, Object> entry1 : hm.entrySet()) {
            System.out.println(entry1.getKey() + " : " + entry1.getValue());
        }
    }
}

