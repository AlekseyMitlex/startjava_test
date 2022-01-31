package annotation.ex2;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Employee.MyAnnotation
public class Employee {

    String name;
    double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @MyAnnotation
    public void increaseSalary() {
        salary *= 2;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    // Target применение выбираем, допустим к методу
    @Target({ElementType.TYPE, ElementType.METHOD})
    // Описывает жизненный цикл, до какого этапа будет видна аннотация
    @Retention(RetentionPolicy.RUNTIME)
            // Создание собственной аннотации
    @interface MyAnnotation {
    }
}
