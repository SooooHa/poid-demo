package cn.nn.service;

import cn.nn.domain.Lesson;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.util.CellRangeAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: 57251180@qq.com
 * Date: 1/6/2020
 */
@Service
public class LessonService {
    @Autowired
    LessonService lessonService;


    public List<Lesson> findAll(String clazz){
        List<Lesson> all = lessonService.findAll(clazz);
        return all;
    }

    public HSSFWorkbook export(List<Lesson> list){
        HSSFWorkbook wb = new HSSFWorkbook();
        HSSFSheet sheet=wb.createSheet("课程表");
        HSSFRow row1=sheet.createRow(0);
        HSSFCell cell=row1.createCell(0);
        cell.setCellValue("课程表");
        sheet.addMergedRegion(new CellRangeAddress(0,0,0,3));

        HSSFRow row2 = sheet.createRow(1);
        row1.createCell(0).setCellValue("");
        row1.createCell(1).setCellValue("第一节课");
        row1.createCell(2).setCellValue("第二节课");
        row1.createCell(3).setCellValue("第三节课");
        row1.createCell(4).setCellValue("第四节课");
        row1.createCell(5).setCellValue("第五节课");
        row1.createCell(6).setCellValue("第六节课");
        row1.createCell(7).setCellValue("第七节课");
        row1.createCell(8).setCellValue("第八节课");
        for (int j2 = 0 ;j2<7;j2++){

        }

        return null;
    }
}
