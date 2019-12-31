package cn.nn;

import cn.nn.dao.UserDao;
import cn.nn.domain.User;
import cn.nn.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


/**
 * Created by IntelliJ IDEA.
 * User: 57251180@qq.com
 * Date: 12/31/2019
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class DaoTest {
    @Autowired
    UserService userService;

    @Autowired
    UserDao userDao;

    @Test
    public void test1(){
        List<User> all = userDao.findAll();
        System.out.println(all);
    }
}
