package junit.ex2;

import org.junit.*;
import org.junit.rules.TestRule;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class MyMathTest {

    int a;
    int b;
    int expResult;

    public MyMathTest(int a, int b, int expResult) {
        this.a = a;
        this.b = b;
        this.expResult = expResult;
    }

    @Parameterized.Parameters
    public static Collection numbers() {
        // Подаём набор разных параметров на add. Если
        // задача сложная и много разных данных может быть
        return Arrays.asList(new Object[][]{{-1, 2, 1}, {2, -9, -7}, {3, 0, 3}});
    }

    // Общее правило для всех, пауза, секунд
    @Rule
    public TestRule timeout = new Timeout(1000);

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void add() {
//        int a = 0;
//        int b = 0;
//        int expResult = 0;
        int result = MyMath.add(a, b);
        assertEquals(expResult, result, 1e-9);

    }

    @Ignore
    @Test(expected = ArithmeticException.class)
    public void div() throws InterruptedException {
        int a = 6;
        int b = 0;
        int expResult = 2;
        int result = MyMath.div(a, b);
        assertEquals(expResult, result, 1e-9);
    }

}