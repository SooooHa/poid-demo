package cn.nn.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 * User: 57251180@qq.com
 * Date: 12/31/2019
 */
@AllArgsConstructor
@Data
@ToString
public class Student implements Serializable {
    private Integer sno;
    private String name;
    private String age;
}
