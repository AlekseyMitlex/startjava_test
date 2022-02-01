package annotation.topjava_blog.retention;

//      В этом примере мы создали свою собственную аннотацию RetentionAnnotation,
// а также использовали аннотацию @Deprecated, которая также имеет политику RetentionPolicy.RUNTIME.
//      Если мы исправим политику аннотации RetentionAnnotation с RetentionPolicy.RUNTIME
// на RetentionPolicy.SOURCE (и закомментируем строку в классе Main,
// выводящую второй элемент массива), то программа отобразит только одну аннотацию deprecated,
// поскольку аннотация с RetentionPolicy.SOURCE во время компиляции будет удалена.
@RetentionAnnotation
@Deprecated
public class AnnotatedClass {
}
