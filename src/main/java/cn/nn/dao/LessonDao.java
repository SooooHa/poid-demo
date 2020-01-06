package cn.nn.dao;

import cn.nn.domain.LessonType;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: 57251180@qq.com
 * Date: 1/6/2020
 */

@Mapper
public interface LessonDao {
    List<LessonType> findByLesson(String clazz);
}

