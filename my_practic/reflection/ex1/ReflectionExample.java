package reflection.ex1;

import reflection.ex1.rabbit.Rabbit;

public class ReflectionExample {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        // Объект потрошитель
        ReflectionChecker checker = new ReflectionChecker();
        // Объект потрошения rabbit
        Rabbit rabbit = new Rabbit();
        checker.showClassName(rabbit);
        checker.showClassFields(rabbit);
        checker.showClassMethods(checker);
        checker.showFieldsAnnotations(rabbit);

        System.out.println(rabbit.getRabbitAge());
        System.out.println(rabbit.getRabbitName());

        checker.fillPrivateFields(rabbit);
        System.out.println(rabbit.getRabbitAge());
        System.out.println(rabbit.getRabbitName());

        Object clone = checker.createNewObject(rabbit);
        checker.showClassName(clone);
    }
}
