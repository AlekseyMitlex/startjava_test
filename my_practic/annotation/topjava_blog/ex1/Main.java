package annotation.topjava_blog.ex1;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) throws NoSuchMethodException, ClassNotFoundException {
        Class<DemoClass> demoClassObj = DemoClass.class;
        // Мои потуги понять это
//        Class emoClassObj = Class.forName("annotation.topjava_blog.ex1.DemoClass");
//        JavaFileInfo jf = (JavaFileInfo) emoClassObj.getAnnotation(JavaFileInfo.class);
//        System.out.println("Annotation info from Xiaomi class:  " +
//                jf.name() + ", " + jf.value());
        readAnnotationOn(demoClassObj);
        Method method = demoClassObj.getMethod("printString");
        readAnnotationOn(method);
    }

    static void readAnnotationOn(AnnotatedElement element) {
        try {
            System.out.println("\nПоиск аннотаций в " + element.getClass().getName());
            Annotation[] annotations = element.getAnnotations();
            for (Annotation annotation : annotations) {
                if (annotation instanceof JavaFileInfo fileInfo) {
                    System.out.println("Автор: " + fileInfo.name());
                    System.out.println("Версия: " + fileInfo.value());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
