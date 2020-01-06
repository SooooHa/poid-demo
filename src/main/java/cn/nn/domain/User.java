package cn.nn.domain;


import lombok.Data;
import lombok.ToString;

import java.io.Serializable;


@Data
@ToString
public class User implements Serializable {
  private Integer id;
  private Integer age;
  private String username;
  private String password;
  private String email;
  private String sex;



}
