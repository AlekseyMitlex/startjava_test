package junit.alishev.ex1;

import org.junit.Test;

public class NetworkUtilsTest {

    @Test(timeout = 2000)
    public void getConnectionShouldReturnFasterThanSecond() {
        NetworkUtils.getConnection();
    }
}