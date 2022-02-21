package Initializing_fields;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class InitializingObjectFields {

    // Поля объекта инициализируются во время конструирования экземпляра класса.
    // В Java существует 3 типа такой инициализации:
    //
    // 1. инициализация в месте объявления
    // 2. инициализация в нестатическом блоке
    // 3. инициализация в конструкторе

    // 1. Инициализация поля "a" будет произведена во время конструирования объекта InitializingObjectFields
    int a;

    // 2. Данный тип инициализации может использоваться, если:
    // - во время инициализации необходимо обработать проверяемое исключение
    // - значение поля не удобно вычислять с помощью выражения
    //      (например, для этого нужен специально созданный класс или метод, который
    //      не хочется создавать только для этих целей)
    // - необходимо инициализировать поле анонимного класса
    //      (в анонимном классе невозможно объявить конструктор)
    Date start;

    {
        try {
            start = new SimpleDateFormat("dd.MM.yyyy").parse("01.01.2000");
        } catch (ParseException impossible) {
        }
    }

    // 3. Конструктор
    String login;

    InitializingObjectFields(String login) {
        this.login = login;
    }

    public static void main(String[] args) {

        InitializingObjectFields initializingObjectFields = new InitializingObjectFields("KotoPes");
        initializingObjectFields.a = 100;


    }
}
