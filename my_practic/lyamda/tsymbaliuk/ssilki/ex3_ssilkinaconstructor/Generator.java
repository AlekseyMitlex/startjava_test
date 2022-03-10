package lyamda.tsymbaliuk.ssilki.ex3_ssilkinaconstructor;

// Функциональный интерфейс - пример с одним нереализованным методом с
//      Object значением, параметров у которого нет
@FunctionalInterface
interface GeneratorList {
    public Object createNewObject();
}

// В массивах нужно указать размер, поэтому int
interface GeneratorMassive {
    public Object createNewObject(int size);
}
