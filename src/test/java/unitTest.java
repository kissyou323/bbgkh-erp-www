import com.love.controller.StudyRest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Created by lixiang on 2016/7/17.
 */
@RunWith(JUnit4.class)
public class unitTest {

    @Test
    public void testGet(){
        new StudyRest().testHttpClientGet();
    }
}
