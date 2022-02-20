package junit.nemchinskii;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReverseTest {

    @Test
    public void test() {
        assertEquals("olleH dlroW", Reverse.reverse("codewarEtc.etc.Hello World"));
    }
}