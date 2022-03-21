package generics.tregulov.igra;

public class Test {

    public static void main(String[] args) {
        Schoolar schoolar1 = new Schoolar("IvAN", 13);
        Schoolar schoolar2 = new Schoolar("mARIA", 15);
        Schoolar schoolar3 = new Schoolar("Fedya", 15);
        Schoolar schoolar4 = new Schoolar("Vasya", 15);

        Student student1 = new Student("Nikolai", 20);
        Student student2 = new Student("Ksenia", 18);

        Employee employee1 = new Employee("Zaur", 32);
        Employee employee2 = new Employee("Mikhail", 47);

        Team<Schoolar> schoolarTeam = new Team("Drakoni");
        Team<Schoolar> schoolarTeam2 = new Team("Mudreci");
        Team<Student> studentTeam = new Team("Vpered");
        Team<Employee> employeeTeam = new Team("Rabotyagi");
        // с помощью дженерик запретили создавать любые команды
//        Team<String> stringTeam = new Team("Fantasia");
        schoolarTeam.addParticipant(schoolar1);
        schoolarTeam.addParticipant(schoolar2);
        schoolarTeam.addParticipant(schoolar3);
        schoolarTeam.addParticipant(schoolar4);

        // с помощью дженерик запретили мешать команды
//        schoolarTeam.addParticipant(student1);
//        schoolarTeam.addParticipant(employee2);

        studentTeam.addParticipant(student1);
        studentTeam.addParticipant(student2);

        employeeTeam.addParticipant(employee1);
        employeeTeam.addParticipant(employee2);

        schoolarTeam.playWith(schoolarTeam2);

        // с помощью дженерик запретили играть командам разной категории
        schoolarTeam.playWith(schoolarTeam2);


    }

}
