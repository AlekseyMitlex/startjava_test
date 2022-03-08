package lyamda.baymana.ex1;

// Связующее звено между выключателем и лампой (ссылка на метод)
// Интерфейс - некий набор заголовков методов, которые должны быть реализованы
//      в классах, реализующих этот интерфейс
public interface ElectricityConsumer {

    void electricityOn(Object sender);
}
