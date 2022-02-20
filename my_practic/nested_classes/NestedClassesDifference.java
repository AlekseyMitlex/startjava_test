package nested_classes;

public class NestedClassesDifference {

    //  Nested классы используются для того, чтобы:
    //  - привязать какой-то класс к другому классу/методу/конструктору,
    //      т.е. в других случаях они не используются
    //  - имеют доступ к static private внешнего класса
    //  - private полю nested класса можно получить во внешнем классе
    //      через создание объекта nested класса

    // Static Inner(внутренний) класс
    static class A {
    }

    // Inner(внутренний) Класс/Интерфейс
    class B {
    }

    void method() {
        // Local внутри метода/блока/конструктора класс
        class C {
        }
    }

    // Anonymous классы
//    .....
}
