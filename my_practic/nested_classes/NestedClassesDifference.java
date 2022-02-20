package nested_classes;

public class NestedClassesDifference {

    //  Nested классы используются для того, чтобы:
    //  - привязать какой-то класс к другому классу/методу/конструктору,
    //      т.е. в других случаях они не используются
    //  - имеют доступ к private внешнего класса

    // Static Inner(внутренний) класс
    static class A {
    }

    // Inner(внутренний) класс
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
