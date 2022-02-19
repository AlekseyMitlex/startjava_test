package collection.list.stack_tregulov;

import java.util.Stack;

public class StackEx2 {

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Zaur");
        stack.push("Misha");
        stack.push("Oleg");
        stack.push("Katya");
        System.out.println("stack = " + stack);

        //  pop -возвращает элемент, который находится на самом верху стека
        //  и сразу его удаляет
        System.out.println("stack.pop() = " + stack.pop());
        System.out.println("stack = " + stack);

        // Чистит стек поочереди доставай верхние элементы
        while (!stack.isEmpty()) {
            System.out.println("stack.pop() = " + stack.pop());
            System.out.println("stack = " + stack);
        }

        stack.push("Zaur");
        stack.push("Misha");
        stack.push("Oleg");
        stack.push("Katya");

        // peek() -возвращает элемент, который находится на самом верху стека
        System.out.println("stack.peek() = " + stack.peek());
    }
}
