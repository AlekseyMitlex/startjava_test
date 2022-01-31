package annotation.ex2;

import java.lang.annotation.*;

public class MyAnnotation {

    public static void main(String[] args) throws ClassNotFoundException {
        // Вывод аннотации для Xiaomi
        Class xiaomiClass = Class.forName("annotation.ex2.Xiaomi");
        Annotation annotation1 = xiaomiClass.getAnnotation(SmartPhone.class);
        SmartPhone sm1 = (SmartPhone) annotation1;
        System.out.println("Annotation info from Xiaomi class:  " +
                sm1.OS() + ", " + sm1.yearOfCompanyCreation());
        // Вывод аннотации для Iphone
        Class IphoneClass = Class.forName("annotation.ex2.Iphone");
        Annotation annotation2 = IphoneClass.getAnnotation(SmartPhone.class);
        SmartPhone sm2 = (SmartPhone) annotation2;
        System.out.println("Annotation info from Iphone class:  " +
                sm2.OS() + ", " + sm2.yearOfCompanyCreation());
    }
}

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface SmartPhone {
    String OS() default "Android";

    int yearOfCompanyCreation() default 2010;
}

@SmartPhone
class Xiaomi {

    String model;
    double price;
}

@SmartPhone(OS = "IOS", yearOfCompanyCreation = 1976)
class Iphone {

    String model;
    double price;
}