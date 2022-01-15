package comparation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CompArable {

    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        Employee emp1 = new Employee(100, "Zaur", "Tregulov", 12345);
        Employee emp2 = new Employee(15, "Ivan", "Petrov", 6542);
        Employee emp3 = new Employee(100, "Ivan", "Sidorov", 8542);
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        System.out.println("Before sort \n" + list);

        Collections.sort(list);

        // Sort Id
//        Collections.sort(list, new IdComparator());

        // Sort Name
//        Collections.sort(list, new NameIdComparator());

        // Sort Salary
//        Collections.sort(list, new SalaryIdComparator());
        System.out.println("After sort \n" + list);
    }
}

class Employee implements Comparable<Employee> {

    int id;
    String name;
    String surname;
    int salary;

    public Employee(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee anotherEmp) {

        // Три разных способа, одно и тоже

        // Easy way
        if (this.id == anotherEmp.id) {
            return 0;
        } else if (this.id < anotherEmp.id) {
            return -1;
        } else {
            return 1;
        }


        // Second way
//        return this.id - anotherEmp.id;

        // Third way
//        return Integer.compare(this.id, anotherEmp.id);

        // по name sort
//        return this.name.compareTo(anotherEmp.name);

        // Имена одинаковые, нужно добавить доп. сортировку
//        int res = this.name.compareTo(anotherEmp.name);
//        if (res == 0) {
//            res = this.surname.compareTo(anotherEmp.surname);
//        }
//        return res;
    }
}

//class IdComparator implements Comparator<Employee> {
//    @Override
//    public int compare(Employee emp1, Employee emp2) {
//        if (emp1.id == emp2.id) {
//            return 0;
//        } else if (emp1.id < emp2.id) {
//            return -1;
//        } else return 1;
//    }
//}

class NameIdComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee emp1, Employee emp2) {
        return emp1.name.compareTo(emp2.name);
    }
}

class SalaryIdComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee emp1, Employee emp2) {
        return emp1.salary - emp2.salary;
    }
}