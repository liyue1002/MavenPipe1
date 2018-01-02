import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by nathan on 2017/12/31.
 */
public class MavenPipeTest {
    @Test
    public void unitTest() throws Exception {
        MavenPipe mp = new MavenPipe();

        assertEquals(10, mp.unitTest());
    }

}