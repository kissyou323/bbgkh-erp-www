import com.love.model.Projects;
import com.love.service.ProjectsService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by lixiang on 2016/7/18.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/applicationContext.xml"})
public class projectsTest {

    @Autowired
    private ProjectsService projectsService;

    @Test
    public void testSelect(){
        List<Projects> list = projectsService.selectAll();
        list.forEach(x->x.getRemark());
    }

}
