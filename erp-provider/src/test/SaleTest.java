import com.alibaba.fastjson.JSON;
import com.bbgkh.model.BaseInfo;
import com.bbgkh.service.ISaleService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by lixiang01 on 2/15/2017.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-mybatis.xml")
public class SaleTest {

    @Autowired
    private ISaleService saleService;

    @Test
    @Transactional
    @Rollback
    public void deleteById(){
        BaseInfo baseInfo = saleService.deleteById("75");
        System.out.println(JSON.toJSON(baseInfo));
    }

}
