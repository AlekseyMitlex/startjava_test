package junit.alishev.ex1;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class Vector2DTest {

    private final double EPS = 1e-9;
    private static Vector2D v1;

    @BeforeClass
    public static void createNewVector() {
        v1 = new Vector2D();
    }

    @Test
    public void newVectorShouldHaveZeroLength() {
        // assertion - Желаемый результат совпадает с фактическим
        // 1e-9 = 0.000000001 Так как double - допустимое отклонение
        Assert.assertEquals(0, v1.length(), EPS);
    }

    @Test
    public void newVectorShouldHaveZeroX() {
        Assert.assertEquals(0, v1.getX(), EPS);
    }

    @Test
    public void newVectorShouldHaveZeroY() {
        Assert.assertEquals(0, v1.getY(), EPS);
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