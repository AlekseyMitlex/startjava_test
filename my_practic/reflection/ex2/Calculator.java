package reflection.ex2;

// На тему, что мы можем сделать с рефликсии и что не можем без неё

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Calculator {

    void summ(int a, int b) {
        int result = a + b;
        System.out.println("Сумма " + a + " и " + b + " = " + result);
    }

    void subtraction(int a, int b) {
        int result = a - b;
        System.out.println("Разница " + a + " и " + b + " = " + result);
    }

    void multiplication(int a, int b) {
        int result = a + b;
        System.out.println("Произведение " + a + " и " + b + " = " + result);
    }

    void division(int a, int b) {
        int result = a + b;
        System.out.println("Частное " + a + " и " + b + " = " + result);
    }
}

class TestCalculator {

    public static void main(String[] args) {
        // Создаём файл и читаем
        try (BufferedReader reader = new BufferedReader(new FileReader("reflectionEx2.txt"))) {
            String methodName = reader.readLine();
            String firstArgument = reader.readLine();
            String secondArgument = reader.readLine();

            Calculator calculator = new Calculator();
            // Создаём объект Class. Рефлекшион
            Class cl = calculator.getClass();
            Method method = null;

            // Ищем из 4 методов подходящий
            Method[] methods = cl.getDeclaredMethods();
            for (Method myMethod : methods) {
                // Если myMethod.getName() из прочитанного равен String methodName из файла, то
                // Method method = null; присваиваю myMethod.getName()
                if (myMethod.getName().equals(methodName)) {
                    method = myMethod;
                }
            }
            // Запуск метода на объект calculator c переменными
            // String first/second(Argument) и переводим в int
            method.invoke(calculator, Integer.parseInt(firstArgument), Integer.parseInt(secondArgument));


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}