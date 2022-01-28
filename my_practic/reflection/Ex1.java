package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class Ex1 {

    public static void main(String[] args) throws ClassNotFoundException
            , NoSuchFieldException, NoSuchMethodException {

        // 3 способа создать объект класса, который называется Класс
        // создать объект, который является объектом Класса Employee
        Class employeeClass = Class.forName("reflection.Employee");
        // 2-й
//        Class employeeClass2 = Employee.class;
        // 3-й
//        Employee emp = new Employee();
//        Class employeeClass3 = emp.getClass();

        Field someField = employeeClass.getField("id");
        System.out.println("Type of id field = " + someField.getType() + "\n");

        Field[] fields = employeeClass.getFields();
        for (Field field : fields) {
            System.out.println("Type of " + field.getName() + " = " + field.getType() + "\n");
        }

        Field[] allFields = employeeClass.getDeclaredFields();
        for (Field field1 : allFields) {
            System.out.println("Type of " + field1.getName() + " = " + field1.getType());
        }

        System.out.println("___________________________________________________");

        Method someMethod1 = employeeClass.getMethod("increaseSalary");
        System.out.println("Return type of method increaseSalary = " +
                someMethod1.getReturnType() + ", parameter types = " +
                Arrays.toString(someMethod1.getParameterTypes()));

        Method someMethod2 = employeeClass.getMethod("setSalary", double.class);
        System.out.println("Return type of method setSalary = " +
                someMethod2.getReturnType() + ", parameter types = " +
                Arrays.toString(someMethod2.getParameterTypes()));

        Method[] methods = employeeClass.getMethods();
        for (Method method : methods) {
            System.out.println("Name of method = " + method.getName() + ", return type = " +
                    method.getReturnType() + ", parameter types = " +
                    Arrays.toString(method.getParameterTypes()));
        }
        System.out.println("*************************");
        Method[] allMethods = employeeClass.getDeclaredMethods();
        for (Method method : allMethods) {
            System.out.println("Name of method = " + method.getName() + ", return type = " +
                    method.getReturnType() + ", parameter types = " +
                    Arrays.toString(method.getParameterTypes()));
        }

        System.out.println("*************************");
        Method[] allMethods2 = employeeClass.getDeclaredMethods();
        for (Method method : allMethods2) {
            if (Modifier.isPublic(method.getModifiers()))
                System.out.println("Name of method = " + method.getName() + ", return type = " +
                        method.getReturnType() + ", parameter types = " +
                        Arrays.toString(method.getParameterTypes()));
        }

        Constructor constructor1 = employeeClass.getConstructor();
        System.out.println("Constructor has " + constructor1.getParameterCount() +
                " parametrs, their types are: " +
                Arrays.toString(constructor1.getParameterTypes()));

        System.out.println("*************************");
        Constructor constructor2 = employeeClass.getConstructor(int.class, String.class, String.class);
        System.out.println("Constructor has " + constructor2.getParameterCount() +
                " parametrs, their types are: " +
                Arrays.toString(constructor2.getParameterTypes()));

        System.out.println("*************************");
        Constructor constructor3 = employeeClass.getConstructor(int.class, String.class, String.class, double.class);
        System.out.println("Constructor has " + constructor3.getParameterCount() +
                " parametrs, their types are: " +
                Arrays.toString(constructor3.getParameterTypes()));

        System.out.println("*************************");
        Constructor[] constructors = employeeClass.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println("Constructor has " + constructor.getParameterCount() +
                    " parametrs, their types are: " +
                    Arrays.toString(constructor.getParameterTypes()));
        }

    }
}
