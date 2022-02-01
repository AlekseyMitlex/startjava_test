package annotation.topjava_blog.inherited;

// Что мы получили сейчас: в классе Parent применены две аннотации
// (одна из них наследуемая), а в классе Child аннотации явно отсутствуют,
// но неявно присутствует унаследованная от родительского класса
// аннотация @InheritantAnnotation.
@NonInheritantAnnotation
@InheritantAnnotation
public class Parent {
}
