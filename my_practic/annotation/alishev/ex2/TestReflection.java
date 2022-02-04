package annotation.alishev.ex2;

import java.lang.reflect.Method;
import java.util.Arrays;

public class TestReflection {

    public static void main(String[] args) throws ClassNotFoundException {
        // 1 sposob
        Person person = new Person();
        Class personClass2 = person.getClass();
        // 2 sposob
        Class personClass3 = Class.forName("annotation.alishev.ex2.Person");
        // 3 sposob sozdat obiect personClass klassa Person klassa Class
        Class personClass = Person.class;
        Method[] methods = personClass.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println("methods = " + method.getReturnType() + method.getName() + Arrays.toString(method.getParameterTypes()));
//            System.out.println("methods = " + Arrays.toString(method.getParameterTypes()));
//            System.out.println("methods = " + method.getReturnType());
        }
    }
}
