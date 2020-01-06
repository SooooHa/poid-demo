package cn.nn.controller;

import cn.nn.domain.Lesson;
import cn.nn.service.LessonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: 57251180@qq.com
 * Date: 1/6/2020
 */
@Controller
public class LessonController {
    @Autowired
    LessonService lessonService;

    public void exportExcel(HttpServletRequest request, HttpServletResponse response){


    }
}
