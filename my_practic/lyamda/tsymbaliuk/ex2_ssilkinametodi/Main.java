package lyamda.tsymbaliuk.ex2_ssilkinametodi;

// Как получить ссылку на обычный/статический метод конкретного объекта?
public class Main {

    public static void main(String[] args) {
        System.out.println("___________Метод__________");
        // Сначала нужно создать объект класса
        SimpleGen sg = new SimpleGen(5);

        // Присваиваем ссылке типа функциональный интерфейс -
        //      ссылку на метод нашего объекта sg
        Generator gen1 = sg::getNumber;

        // Используя эту ссылку - можем вызвать метод этого интерфейса
        int temp = gen1.getNextElement();

        // ВЫВОД: Использовали метод интерфейса без реализации, как?
        //      главное чтобы совпадали возвращаемые значения
        //      (int) и список параметров, это getNumber() и getNextElement()
        //      Названия методов и иплементировать класс неважно
        System.out.println("temp = " + temp);

        System.out.println("___________Статический метод__________");

        // То же самое, но уже не объект используем, т.к.
        //      static метод принадлежит классу
        Generator gen2 = SimpleGen::getRandomNumber;
        int temp2 = gen2.getNextElement();
        System.out.println("temp2 = " + temp2);

        // Ссылку на обычный метод можно использовать с любым объектом,
        //      через объект класса, при условии если параметр интерфейса
        //  будет таким параметром класса public int getNextElement(SimpleGen a);,
        //          это возможно, потому что если нет в методе нашем параметров,
        //          но по стандарту там расположено public int getNumber(SimpleGen this)
        // Generator gen3 = SimpleGen::getNumber;

    }
}
