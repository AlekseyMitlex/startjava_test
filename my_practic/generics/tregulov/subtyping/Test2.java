package generics.tregulov.subtyping;

public class Test2 {

    // Можем писать так. обычный объект сабкласса
    X x = new Y();

    // В дженериках сабкласс наследника не работает
    // если List<X>, то и в конце должен быть только <X>
//    List<X> list1 = new ArrayList<Y>();

    // Нельзя, только List<Number> Number
//    List<Number> list = new ArrayList<Number>();
//    list.add(18);
//    list.add(3.14);
}

class X {
}

class Y extends X {
}