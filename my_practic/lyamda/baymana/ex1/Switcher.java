package lyamda.baymana.ex1;

import java.util.ArrayList;
import java.util.List;

// Модель некого выключателя
public class Switcher {

    // Поле для хранения ссылки на объект любого класса реализующего данный интерфейс
    private List<ElectricityConsumer> listeners = new ArrayList<>();

    //Метод добавления потребителя электричества, c параметром тип интерфейс(потребитель)
    public void addElectricityListener(ElectricityConsumer listener) {
        listeners.add(listener);
    }

    //Метод удаления потребителя электричества, c параметром тип интерфейс(потребитель)
    public void removeElectricityListener(ElectricityConsumer listener) {
        listeners.remove(listener);
    }

    public void switchOn() {
        System.out.println("Выключатель включен");
        // Проверка. А не пустое ли у нас consumer поле? Если есть,
        //      то можем вызвать метод electricityOn().
        // Можем сделать так, потому что эта ссылка указывает на
        //      объекты классов реализующих этот интерфейс
/*        if (consumer != null) {
            consumer.electricityOn();
*/
        for (ElectricityConsumer c : listeners) {
            c.electricityOn(this);
        }
    }
}
