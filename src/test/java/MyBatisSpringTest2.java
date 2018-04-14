import com.troy1024.bean.Article;
import com.troy1024.bean.User;
import com.troy1024.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by tangly on 2018/4/14.
 */
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class MyBatisSpringTest2 {

    @Resource
    UserMapper mapper;

    @Test
    public void test() {
        //测试id=1的用户查询，根据数据库中的情况，可以改成你自己的.
        System.out.println("得到用户id=1的用户信息");
        User user = mapper.findUserById(1);
        System.out.println(user);

        //得到文章列表测试
        System.out.println("得到用户id为1的所有文章列表");
        List<Article> articles = mapper.getUserArticlesByUserId(1);

        for (Article article : articles) {
            System.out.println(article);
        }
    }
}
