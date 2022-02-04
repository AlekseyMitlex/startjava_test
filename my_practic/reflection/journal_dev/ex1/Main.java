package reflection.journal_dev.ex1;

import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public Main() throws ClassNotFoundException {
    }

    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, InstantiationException {
// TODO : Get Class Object
// Get Class using reflection
        Class<?> concreteClass = ConcreteClass.class;
        try {
            // below method is used most of the times in frameworks like JUnit
            //Spring dependency injection, Tomcat web container
            //Eclipse auto completion of method names, hibernate, Struts2 etc.
            //because ConcreteClass is not available at compile time
            concreteClass = Class.forName("reflection.journal_dev.ex1.ConcreteClass");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("getCanonicalName = " + concreteClass.getCanonicalName()); // prints com.journaldev.reflection.ConcreteClass

//for primitive types, wrapper classes and arrays
        Class<?> booleanClass = boolean.class;
        System.out.println(booleanClass.getCanonicalName()); // prints boolean

        Class<?> cDouble = Double.TYPE;
        System.out.println(cDouble.getCanonicalName()); // prints double

        Class<?> cDoubleArray = Class.forName("[D");
        System.out.println(cDoubleArray.getCanonicalName()); //prints double[]

        Class<?> twoDStringArray = String[][].class;
        System.out.println(twoDStringArray.getCanonicalName()); // prints java.lang.String[][]


        // TODO : Get Super class
        System.out.println("\n" + " Get Super class!!!!" + "\n");

        Class<?> superClass = Class.forName("reflection.journal_dev.ex1.ConcreteClass").getSuperclass();
        System.out.println(superClass); // prints "class com.journaldev.reflection.BaseClass"
        System.out.println(Object.class.getSuperclass()); // prints "null"
        System.out.println(String[][].class.getSuperclass());// prints "class java.lang.Object"

        // TODO : Get Public Member Classes
        //  (все public классы и интерфейсы в супер/наследнике)
        System.out.println("\n" + " Get Public Member Classes!!!!" + "\n");

        Class<?>[] classes = concreteClass.getClasses();
//[class com.journaldev.reflection.ConcreteClass$ConcreteClassPublicClass,
//class com.journaldev.reflection.ConcreteClass$ConcreteClassPublicEnum,
//interface com.journaldev.reflection.ConcreteClass$ConcreteClassPublicInterface,
//class com.journaldev.reflection.BaseClass$BaseClassInnerClass,
//class com.journaldev.reflection.BaseClass$BaseClassMemberEnum]
        System.out.println(Arrays.toString(classes));

        // TODO : Get Declared Classes(все классы/интерфейсы/енум из ConcreteClass)
        System.out.println("\n" + " Get Declared Classes!!!!" + "\n");


//getting all of the classes, interfaces, and enums that are explicitly declared in ConcreteClass
        Class<?>[] explicitClasses = Class.forName("reflection.journal_dev.ex1.ConcreteClass").getDeclaredClasses();
//prints [class com.journaldev.reflection.ConcreteClass$ConcreteClassDefaultClass,
//class com.journaldev.reflection.ConcreteClass$ConcreteClassDefaultEnum,
//class com.journaldev.reflection.ConcreteClass$ConcreteClassPrivateClass,
//class com.journaldev.reflection.ConcreteClass$ConcreteClassProtectedClass,
//class com.journaldev.reflection.ConcreteClass$ConcreteClassPublicClass,
//class com.journaldev.reflection.ConcreteClass$ConcreteClassPublicEnum,
//interface com.journaldev.reflection.ConcreteClass$ConcreteClassPublicInterface]
        System.out.println(Arrays.toString(explicitClasses));

        // TODO : Get Declaring Class
        System.out.println("\n" + " Get Declaring Class!!!!" + "\n");


        Class<?> innerClass = Class.forName("reflection.journal_dev.ex1.ConcreteClass$ConcreteClassDefaultClass");
//prints com.journaldev.reflection.ConcreteClass
        System.out.println(innerClass.getDeclaringClass().getCanonicalName());
        System.out.println(innerClass.getEnclosingClass().getCanonicalName());

        // TODO : Getting Package Name
        System.out.println("\n" + " Getting Package Name!!!!" + "\n");


//prints "com.journaldev.reflection"
        System.out.println(Class.forName("reflection.journal_dev.ex1.BaseInterface").getPackage().getName());

        // TODO : Getting Class Modifiers (Модифаер класса/интерфейса и т.д.)
        System.out.println("\n" + " Getting Class Modifiers!!!!" + "\n");


        System.out.println(Modifier.toString(concreteClass.getModifiers())); //prints "public"
        //prints "public abstract interface"
        System.out.println(Modifier.toString(Class.forName("reflection.journal_dev.ex1.BaseInterface").getModifiers()));
        System.out.println(Modifier.toString(Class.forName("reflection.journal_dev.ex1.BaseClass").getModifiers()));
        System.out.println(Modifier.toString(Class.forName("reflection.journal_dev.ex1.Main").getModifiers()));

        // TODO : Get Type Parameters (Возвращает дженерики класса, если есть)
        System.out.println("\n" + " Get Type Parameters!!!!" + "\n");


//Get Type parameters (generics)
        TypeVariable<?>[] typeParameters = Class.forName("java.util.HashMap").getTypeParameters();
        for (TypeVariable<?> t : typeParameters)
            System.out.print(t.getName() + ",");

        // TODO : Get Implemented Interfaces
        System.out.println("\n" + " Get Implemented Interfaces!!!!" + "\n");


        Type[] interfaces = Class.forName("java.util.HashMap").getGenericInterfaces();
        //prints "[java.util.Map<K, V>, interface java.lang.Cloneable, interface java.io.Serializable]"
        System.out.println(Arrays.toString(interfaces));
        //prints "[interface java.util.Map, interface java.lang.Cloneable, interface java.io.Serializable]"
        System.out.println(Arrays.toString(Class.forName("java.util.HashMap").getInterfaces()));

        // TODO : Get All Public Methods
        System.out.println("\n" + " Get All Public Methods!!!!" + "\n");


        Method[] publicMethods = Class.forName("reflection.journal_dev.ex1.ConcreteClass").getMethods();
        //prints public methods of ConcreteClass, BaseClass, Object
        System.out.println(Arrays.toString(publicMethods));
        // TODO Мой вариант, пробный
        Method[] aClass = ConcreteClass.class.getMethods();
        for (Method method : aClass) {
            System.out.println("method = " + method);
        }

        // TODO : Get All Public Constructors
        System.out.println("\n" + " Get All Public Constructors!!!!" + "\n");


        //Get All public constructors
        Constructor<?>[] publicConstructors = Class.forName("reflection.journal_dev.ex1.ConcreteClass").getConstructors();
        //prints public constructors of ConcreteClass
        System.out.println(Arrays.toString(publicConstructors));

        // TODO : Get All Public Fields
        System.out.println("\n" + " Get All Public Fields!!!!" + "\n");


        //Get All public fields
        Field[] publicFields = Class.forName("reflection.journal_dev.ex1.ConcreteClass").getFields();
        //prints public fields of ConcreteClass, it's superclass and super interfaces
        System.out.println(Arrays.toString(publicFields));

        // TODO : Get All Annotations
        System.out.println("\n" + " Get All Annotations!!!!" + "\n");


        Annotation[] annotations = Class.forName("reflection.journal_dev.ex1.ConcreteClass").getAnnotations();
        //prints [@java.lang.Deprecated()]
        System.out.println(Arrays.toString(annotations));

        // TODO : Java Reflection for Fields
        // TODO : Get Public Field and Declaring Class
        System.out.println("\n" + " Java Reflection for Fields!!!!");
        System.out.println(" Get Public Field and Declaring Class!!!" + "\n");

        try {
            Field field = Class.forName("reflection.journal_dev.ex1.ConcreteClass").getField("interfaceInt");
            Class<?> fieldClass = field.getDeclaringClass();
            System.out.println(fieldClass.getCanonicalName()); //prints com.journaldev.reflection.BaseInterface
        } catch (NoSuchFieldException | SecurityException e) {
            e.printStackTrace();
        }

        // TODO : Get Field Type
        System.out.println("\n" + " Get Field Type!!!! " + "\n");

        Field field = Class.forName("reflection.journal_dev.ex1.ConcreteClass").getField("publicInt");
        Class<?> fieldType = field.getType();
        System.out.println(fieldType.getCanonicalName()); //prints int

        // TODO : Get/Set Public Field Value
        System.out.println("\n" + " Get/Set Public Field Value " + "\n");

        Field field2 = Class.forName("reflection.journal_dev.ex1.ConcreteClass").getField("publicInt");
        ConcreteClass obj = new ConcreteClass(5);
        System.out.println(field2.get(obj)); //prints 5
        field2.setInt(obj, 10); //setting field value to 10 in object
        System.out.println(field2.get(obj)); //prints 10

        // TODO : Get/Set Private Field Value
        System.out.println("\n" + " Get/Set Private Field Value " + "\n");


        Field privateField = Class.forName("reflection.journal_dev.ex1.ConcreteClass").getDeclaredField("privateString");
        //turning off access check with below method call
        privateField.setAccessible(true);
        ConcreteClass objTest = new ConcreteClass(1);
        System.out.println(privateField.get(objTest)); // prints "private string"
        privateField.set(objTest, "private string updated");
        System.out.println(privateField.get(objTest)); //prints "private string updated"

        // TODO : Java Reflection for Methods
        // TODO : Get Public Method
        System.out.println("\n" + " Java Reflection for Methods!!!!");
        System.out.println(" Get Public Method!!!" + "\n");

        Method method = Class.forName("reflection.journal_dev.ex1.ConcreteClass").getMethod("method2", String.class);
        //get method parameter types, prints "[class java.lang.Object, class java.lang.Object]"
        System.out.println(Arrays.toString(method.getParameterTypes()));
        //get method return type, return "class java.lang.Object", class reference for void
        System.out.println(method.getReturnType());
        //get method modifiers
        System.out.println(Modifier.toString(method.getModifiers())); //prints "public"

        // TODO : Invoking Public Method
        System.out.println("\n" + " Invoking Public Method " + "\n");

        Method method777 = Class.forName("java.util.HashMap").getMethod("put", Object.class, Object.class);
        Map<String, String> hm = new HashMap<>();
        method777.invoke(hm, "key", "value");
        System.out.println(hm); // prints {key=value}

        // TODO : Invoking Private Methods
        System.out.println("\n" + " Invoking Private Methods " + "\n");


        //invoking private method
        Method methodMethod3 = Class.forName("reflection.journal_dev.ex1.BaseClass").getDeclaredMethod("method3", null);
        methodMethod3.setAccessible(true);
        methodMethod3.invoke(null, null); //prints "Method3"


        // TODO : Java Reflection for Constructors
        // TODO : Get Public Constructor
        System.out.println("\n" + " Java Reflection for Constructors!!!!");
        System.out.println(" Get Public Constructor!!!" + "\n");


        Constructor<?> constructor = Class.forName("reflection.journal_dev.ex1.ConcreteClass").getConstructor(int.class);
        //getting constructor parameters
        System.out.println(Arrays.toString(constructor.getParameterTypes())); // prints "[int]"

        Constructor<?> hashMapConstructor = Class.forName("java.util.HashMap").getConstructor(null);
        System.out.println(Arrays.toString(hashMapConstructor.getParameterTypes())); // prints "[]"

        // TODO : Instantiate Object using Constructor
        System.out.println("\n" + " Instantiate Object using Constructor " + "\n");


        Constructor<?> constructor1 = Class.forName("reflection.journal_dev.ex1.ConcreteClass").getConstructor(int.class);
        //getting constructor parameters
        System.out.println(Arrays.toString(constructor.getParameterTypes())); // prints "[int]"

        Object myObj = constructor.newInstance(10);
        Method myObjMethod = myObj.getClass().getMethod("method1", null);
        myObjMethod.invoke(myObj, null); //prints "Method1 impl."

        Constructor<?> hashMapConstructor1 = Class.forName("java.util.HashMap").getConstructor(null);
        System.out.println(Arrays.toString(hashMapConstructor1.getParameterTypes())); // prints "[]"
        HashMap<String, String> myMap = (HashMap<String, String>) hashMapConstructor1.newInstance(null);


    }
}