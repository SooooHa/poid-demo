package cn.nn.dao;

import cn.nn.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: 57251180@qq.com
 * Date: 12/31/2019
 */
@Mapper
public interface UserDao {
    List<User> findAll();
}
