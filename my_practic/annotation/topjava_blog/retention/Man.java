package annotation.topjava_blog.retention;

import java.lang.annotation.Annotation;

public class Man {
    public static void main(String[] args) {
        AnnotatedClass anAnnotatedClass = new AnnotatedClass();
        Annotation[] annotations = anAnnotatedClass.getClass().getAnnotations();

        System.out.println("Общее кол-во аннотаций времени исполнения (RunTime): " + annotations.length);
        System.out.println("1: " + annotations[0]);
//        System.out.println("2: " + annotations[1]);
    }
}
