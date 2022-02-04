package annotation.alishev.ex2;

@Author(name = "Neil", dateOfCreation = 2019)
public class Person {

    private int id;
    private String name;

    public Person() {
        this.id = -1;
        this.name = "No name";
    }

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Person with id: " + id + " and name: " + name + " says hello");
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
}

