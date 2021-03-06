package annotation.alishev.ex3;

@Author1(name = "Neil", dateOfCreation = 2019)
public class Person1 {

    private int id;
    private String name;

    public Person1() {
        this.id = -1;
        this.name = "No name";
    }

    public Person1(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Person1 with id: " + id + " and name: "
                + name + " says hello");
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
        return "Person1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
