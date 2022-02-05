package junit.alishev.ex1;

import org.junit.Assert;
import org.junit.Test;

public class Vector2DTest {

    @Test
    public void newVectorShouldHaveZeroLength() {
        // action - Создание объекта
        Vector2D v1 = new Vector2D();
        // assertion - Желаемый результат совпадает с фактическим
        // 1e-9 = 0.000000001 Так как double - допустимое отклонение
        Assert.assertEquals(0, v1.length(), 1e-9);
    }

    @Test
    public void newVectorShouldHaveZeroX() {
        Vector2D v1 = new Vector2D();
        Assert.assertEquals(0, v1.getX(), 1e-9);
    }

    @Test
    public void newVectorShouldHaveZeroY() {
        Vector2D v1 = new Vector2D();
        Assert.assertEquals(0, v1.getY(), 1e-9);
    }

    @Test
    public void getX() {
    }

    @Test
    public void setX() {
    }

    @Test
    public void getY() {
    }

    @Test
    public void setY() {
    }

    @Test
    public void length() {
    }
}