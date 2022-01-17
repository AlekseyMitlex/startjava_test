package Pattern.example.flagi;

class Main {

    public static void main(String[] args) {
        System.out.println("Рисуем флаг России:");
        AbstractThreeRowsFlag russianFlag = new RussianFlag();
        russianFlag.drawFlag();

        System.out.println("\nРисуем флаг Нидерландов:");
        AbstractThreeRowsFlag netherlandsFlag = new NetherlandsFlag();
        netherlandsFlag.drawFlag();
    }
}

// ТАК БЫЛО
/*
    public static void main(String[] args) {
        System.out.println("Рисуем флаг России:");
        System.out.println("Флагшток нарисован");
        System.out.println("Полоса белого цвета нарисована");
        System.out.println("Полоса синего цвета нарисована");
        System.out.println("Полоса красного цвета нарисована");

        System.out.println("\nРисуем флаг Нидерландов:");
        System.out.println("Флагшток нарисован");
        System.out.println("Полоса красного цвета нарисована");
        System.out.println("Полоса белого цвета нарисована");
        System.out.println("Полоса синего цвета нарисована");
    }
*/