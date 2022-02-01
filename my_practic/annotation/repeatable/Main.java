package annotation.repeatable;


// В поле value такой аннотации необходимо указать контейнер для повторяющейся аннотации.
// Контейнер также представляет собой аннотацию, в которой поле value является массивом типа повторяющейся аннотации.
//Таким образом, мы должны создать контейнерную аннотацию, а затем указать её тип в качестве аргумента.
@Game(name = "Крикет", day = "воскресенье")
@Game(day = "четверг")
@Game(name = "Хоккей", day = "понедельник")
public class Main {
    public static void main(String[] args) {
        Games games = Main.class.getAnnotation(Games.class);

        for (Game game : games.value()) {
            System.out.println(game.name() + " в " + game.day());
        }
    }
}