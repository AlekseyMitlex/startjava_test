package Algoritm.examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearch1 {

    public static void main(String[] args) {
        Employee emp1 = new Employee(100, "Zaur", 3434);
        Employee emp2 = new Employee(15, "Ivan", 6165);
        Employee emp3 = new Employee(123, "Petr", 6516);
        Employee emp4 = new Employee(15, "Maria", 498);
        Employee emp5 = new Employee(182, "Kolya", 455);
        Employee emp6 = new Employee(15, "Sasha", 56468);
        Employee emp7 = new Employee(250, "Elena", 54165);

        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);
        employeeList.add(emp4);
        employeeList.add(emp5);
        employeeList.add(emp6);
        employeeList.add(emp7);

        System.out.println(employeeList);
        // Sort ArrayList
        Collections.sort(employeeList);
        System.out.println(employeeList);
        // Бинарный Поиск индекса в Аррейлистке значения = 150
        int index2 = Collections.binarySearch(employeeList
                , new Employee(182, "Kolya", 455));
        System.out.println(index2);
    }
}

class Employee implements Comparable<Employee> {

    int id;
    String name;
    int salary;

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee anotherEmp) {
        int result = this.id - anotherEmp.id;
        if (result == 0) {
            result = this.name.compareTo(anotherEmp.name);
        }
        return result;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}