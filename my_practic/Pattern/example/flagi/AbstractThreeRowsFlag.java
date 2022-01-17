package Pattern.example.flagi;

abstract class AbstractThreeRowsFlag {

    abstract void drawUpperLevel();

    abstract void drawMiddleLevel();

    abstract void drawBottomLevel();

    final void drawFlag() {
        drawFlagpole();
        drawUpperLevel();
        drawMiddleLevel();
        drawBottomLevel();
        drawBlazon();
    }

    private void drawFlagpole() {
        System.out.println("Флагшток нарисован");
    }

    void drawBlazon() {
    }
}
