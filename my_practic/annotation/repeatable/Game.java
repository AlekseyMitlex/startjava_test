package annotation.repeatable;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Repeatable(Games.class)
@interface Game {
    String name() default "Что-то под вопросом";
    String day();
}

@Retention(RetentionPolicy.RUNTIME)
@interface Games {
    Game[] value();
}
