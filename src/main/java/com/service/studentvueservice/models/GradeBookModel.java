package com.service.studentvueservice.models;

public class GradeBookModel {
    private Integer id;
    private String gradeLetter;
    private String className;
    private String teacherName;

    public GradeBookModel(Integer id, String gradeLetter, String className, String teacherName) {
        this.id =id;
        this.gradeLetter=gradeLetter;
        this.className=className;
        this.teacherName=teacherName;
    }
//Returns the current value assigned to id//
    public Integer getId() {
        return id;
    }
    

    public String getgradeLetter() {
        return gradeLetter;
    }

    public String getclassName() {
        return className;
    }
    public String getteacherName(){
        return teacherName;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setFirstname(String gradeLetter) {
        this.gradeLetter = gradeLetter;
    }

    public void setclassName(String className) {
        this.className = className;
    }

    public void setteacherName(String teacherName){
        this.teacherName = teacherName;
    }
}   
