package reflection.ex1;

import reflection.ex1.rabbit.RabbitAnnotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

// Класс занимается потрошением, переданных через него объектов
public class ReflectionChecker {

    public void showClassName(Object object) {
        // выведем имя класса переданного нам объекта
        Class clazz = object.getClass();
        System.out.println("clazz = " + clazz);
        System.out.println("clazz.getName() = " + clazz.getName());
    }

    public void showClassFields(Object object) {
        // выведем имя класса переданного нам объекта
        Class clazz = object.getClass();
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.println("fields = " + field.getName());
        }
    }

    public void showClassMethods(Object object) {
        // выведем имя класса переданного нам объекта
        Class clazz = object.getClass();
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println("method = " + method.getName());
        }
    }

    public void showFieldsAnnotations(Object object) {
        // выведем имя класса переданного нам объекта
        Class clazz = object.getClass();
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            Annotation[] annotations = field.getAnnotations();
            for (Annotation annotation : annotations)
                System.out.println(field.getName() + " : " + annotation.toString());
        }
    }

    public void fillPrivateFields(Object object) throws IllegalAccessException {
        // выведем имя класса переданного нам объекта
        Class clazz = object.getClass();
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            Annotation annotation = field.getAnnotation(RabbitAnnotation.class);
            if (annotation == null) {
                continue;
            }
            field.setAccessible(true);
            field.set(object, "Field");
            field.setAccessible(false);
            System.out.println("object = " + object);
        }
    }

    // Создание объекта неизвестного нам класса
    // Создание через рефлекшн происходит в 2 раза медленнее, чем через new
    public Object createNewObject(Object object) throws InstantiationException, IllegalAccessException {
        // выведем имя класса переданного нам объекта
        Class clazz = object.getClass();
        return clazz.newInstance();
    }
}

