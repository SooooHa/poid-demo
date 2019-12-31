package cn.nn.service;

import cn.nn.domain.Student;
import org.apache.poi.hssf.usermodel.*;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: 57251180@qq.com
 * Date: 12/31/2019
 */
@Service
public class StudentExportService {
    String[] excelHeader = { "Sno", "Name", "Age"};
    public HSSFWorkbook export(List<Student> list) {
        HSSFWorkbook wb = new HSSFWorkbook();
        HSSFSheet sheet = wb.createSheet("Student");
        HSSFRow row = sheet.createRow((int) 0);
        HSSFCellStyle style = wb.createCellStyle();
        style.setAlignment(HSSFCellStyle.ALIGN_CENTER);

        for (int i = 0; i < excelHeader.length; i++) {
            HSSFCell cell = row.createCell(i);
            cell.setCellValue(excelHeader[i]);
            cell.setCellStyle(style);
            sheet.autoSizeColumn(i);
            // sheet.SetColumnWidth(i, 100 * 256);
        }

        for (int i = 0; i < list.size(); i++) {
            row = sheet.createRow(i + 1);
            Student student = list.get(i);
            row.createCell(0).setCellValue(student.getSno());
            row.createCell(1).setCellValue(student.getName());
            row.createCell(2).setCellValue(student.getAge());
        }
        return wb;
    }

}
