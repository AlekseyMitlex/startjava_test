package lyamda.baymana.ex1;

public class Program {

    public static void main(String[] args) {
        //1 действие
        // Объект выключателя(кнопка)
        Switcher sw = new Switcher();
        // Объект лампа
        Lamp lamp = new Lamp();
        Radio radio = new Radio();

        // Заносим в поле нашего выключателя ссылку на объект лампы,
        //      т.к. класс реализует наш интерфейс
        // И когда мы включили выключатель у нас зажглась лампа
        sw.addElectricityListener(lamp);
        sw.addElectricityListener(radio);
        sw.addElectricityListener(new Fire());

        // 3 действие, после 2
        // Анонимных класс. Чтобы не создавать лишнее все в 1-м месте
        sw.addElectricityListener(new ElectricityConsumer() {
            @Override
            public void electricityOn(Object sender) {
                System.out.println("Fire Annonim");
                System.out.println("!!!!");
            }
        });

        // Переобуваем в лямду
        sw.addElectricityListener(sender -> {
            System.out.println("Pojar lymda");
            System.out.println("!!!!");
        });


        // При вызове выключателя из метода свич, зажглась лампа,
        //      при этом выключатель ничего не знает лампа
        sw.switchOn();
    }
}

// 2 действие
// Если нужно вывести сообщение, при свич, мне необходимо
//  создать класс/имплементировать интерфейс/объект
class Fire implements ElectricityConsumer {
    @Override
    public void electricityOn(Object sender) {
        System.out.println("Пожар");
    }
}