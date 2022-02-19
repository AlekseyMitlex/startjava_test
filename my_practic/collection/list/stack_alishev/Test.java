package collection.list.stack_alishev;

import java.util.Stack;

public class Test {

    // LIFO очередь
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Добавляет в Стек
        stack.push(5);
        stack.push(3);
        stack.push(1);

        // Достаёт ласт элемент из Стека. stack.pop() = 1 , 
        // пока не останется 0 элементов и будет исключение EmptyStackException
        System.out.println("stack.pop() = " + stack.pop());
        // Посмотреть какой сейчас элемент последний, перед удаленнием
        System.out.println("stack.peek() = " + stack.peek());
        System.out.println("stack.pop() = " + stack.pop());
        System.out.println("stack.pop() = " + stack.pop());
//        System.out.println("stack.pop() = " + stack.pop());

        stack.push(5);
        stack.push(3);
        stack.push(1);

        // Есть элементы? или нет
        System.out.println("stack.isEmpty() = " + stack.isEmpty());

        System.out.println("stack = " + stack);

        // Будем крутить пока не станет пустым наш стек
        while (!stack.empty()) {
            System.out.println("stack = " + stack.pop());
        }

    }
}
