package lyamda.tsymbaliuk.lyamda.ex22_iscluchenie;

import java.io.IOException;

@FunctionalInterface
public interface Saver {
    public void save(Object obj) throws IOException;
}
