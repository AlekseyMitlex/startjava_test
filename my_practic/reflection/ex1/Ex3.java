package reflection.ex1;

import java.lang.reflect.Field;

// Декларируем гет/сет и конструктор на 4 параметра для Салари(инициализирует 100)
// Рефлексия нарушает правила инкапсуляции. Попробуем прочитать Салари!!!

public class Ex3 {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Employee employee = new Employee(10, "Zaur", "IT");

        // 2-й способ вызова Class
        Class employeeClass = employee.getClass();

        // Get field salary через getDeclaredField
        Field field = employeeClass.getDeclaredField("salary");

        // Требуем получить доступ к private Field
        field.setAccessible(true);
        // Пробуем записать значение Field записать в переменную
        double salaryValue = (Double) field.get(employee);
        System.out.println("salaryValue = " + salaryValue);

        // Присвоили з/п работнику 1500
        // т.о. Рефлекшион обходит инкапсуляцию
        field.set(employee, 1500);
        System.out.println("employee = " + employee);

    }
}
