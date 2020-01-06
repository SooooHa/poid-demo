package cn.nn.domain;





public class LessonType {
  private Integer id;
  private String name;
  private String deptid;
  private String proid;
  private String required;


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getDeptid() {
    return deptid;
  }

  public void setDeptid(String deptid) {
    this.deptid = deptid;
  }


  public String getProid() {
    return proid;
  }

  public void setProid(String proid) {
    this.proid = proid;
  }


  public String getRequired() {
    return required;
  }

  public void setRequired(String required) {
    this.required = required;
  }

}
