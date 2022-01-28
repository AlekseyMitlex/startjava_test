package reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
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

    }
}
