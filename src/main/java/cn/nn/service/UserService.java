package cn.nn.service;

import cn.nn.dao.UserDao;

import cn.nn.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * Created by IntelliJ IDEA.
 * User: 57251180@qq.com
 * Date: 12/31/2019
 */
@Service
public class UserService {
    @Autowired
    UserDao userDao;

    List<User> findAll(){
        return userDao.findAll();
    }


}
