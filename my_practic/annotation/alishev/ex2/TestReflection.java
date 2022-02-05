package annotation.alishev.ex2;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
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

        Method[] methods = personClass.getMethods();
        for (Method method : methods) {
            System.out.println(method.getReturnType() + ", " + method.getName() + ", "
                    + Arrays.toString(method.getParameterTypes()));
        }

        Method[] methods1 = personClass.getDeclaredMethods();
        for (Method method : methods1) {
            System.out.println("method = " + method.getReturnType() + ", " + method.getName() + ", "
                    + Arrays.toString(method.getParameterTypes()));
//            System.out.println("methods = " + Arrays.toString(method.getParameterTypes()));
//            System.out.println("methods = " + method.getReturnType());
        }

        Field[] fields = personClass.getDeclaredFields();
        for (Field field : fields) {
            System.out.println("field = " + field.getType() + ", " + field.getName() + ", "
                    + field.getModifiers());
        }

        Annotation[] annotations = personClass.getAnnotations();
        for (Annotation annotation : annotations) {
            if (annotation instanceof Author) {
                System.out.println("Yes");
            }
            System.out.println("annotation = " + annotation.annotationType());
            Author author = (Author) annotation;
            System.out.println("author = " + author.name() + ", " + author.dateOfCreation());
        }
    }
}
