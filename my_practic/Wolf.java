public class Wolf {

    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age, Wolf wolfOne) {
        if (age > 0 && age < 8) {
            this.age = age;
            System.out.println("Age = " + wolfOne.getAge());
        } else {
            System.out.println("Некорректный возраст");
        }
    }
}

class WolfTest {

    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        wolfOne.setAge(7, wolfOne);
    }
}
