package reflection.ex1;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Ex2 {
    public static void main(String[] args) throws ClassNotFoundException
            , InstantiationException, IllegalAccessException
            , NoSuchMethodException, InvocationTargetException {
        Class employeeClass = Class.forName("reflection.ex1.Employee");

        // Устаревший способ newInstance();
//        Employee o = (Employee)employeeClass.newInstance();
//        System.out.println(o);

        // Конструктор с Generics <Employee>
        Constructor<Employee> constructor1 = employeeClass.getConstructor();
        Employee obj1 = constructor1.newInstance();

        // Конструктор с 3 параметрами
        Constructor constructor2 = employeeClass.getConstructor(int.class, String.class, String.class);
        Object obj2 = constructor2.newInstance(5, "Zaur", "IT");
        System.out.println(obj2);

        // Вызов метода с помощью рефлексии
        Method method = employeeClass.getMethod("setSalary", double.class);
        // Запуск этого метода на объект obj2 с з/п 800
        method.invoke(obj2, 800.88);
        System.out.println(obj2);


    }
}
