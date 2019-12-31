package cn.nn.controller;

import cn.nn.domain.Student;
import cn.nn.service.StudentExportService;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: 57251180@qq.com
 * Date: 12/31/2019
 */
@Controller
public class StudentExportController {
    @Autowired
    private StudentExportService studentExportService;

    @RequestMapping(value = "/excel/export")
    public void exportExcel(HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        List<Student> list = new ArrayList<Student>();
        list.add(new Student(1000, "zhangsan", "20"));
        list.add(new Student(1001, "lisi", "23"));
        list.add(new Student(1002, "wangwu", "25"));

        HSSFWorkbook wb = studentExportService.export(list);
        response.setContentType("application/vnd.ms-excel");
        response.setHeader("Content-disposition", "attachment;filename=student.xls");
        OutputStream ouputStream = response.getOutputStream();
        wb.write(ouputStream);
        ouputStream.flush();
        ouputStream.close();
    }
}

