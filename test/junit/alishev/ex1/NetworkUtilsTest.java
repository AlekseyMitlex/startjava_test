package junit.alishev.ex1;

import org.junit.Test;

public class NetworkUtilsTest {

    @Test(timeout = 1000)
    public void getConnectionShouldReturnFasterThanSecond() {
        NetworkUtils.getConnection();
    }
}