package com.uom.ead.emailSender;

public class Student {
    private String fullName;
    private String indexNo;
    private int batch;
    private int semesterNo;
    private  String registeredName;

    public Student(String fullName, String indexNo, int batch, int semesterNo, String registeredName) {
        this.fullName = fullName;
        this.indexNo = indexNo;
        this.batch = batch;
        this.semesterNo = semesterNo;
        this.registeredName = registeredName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getIndexNo() {
        return indexNo;
    }

    public void setIndexNo(String indexNo) {
        this.indexNo = indexNo;
    }

    public int getBatch() {
        return batch;
    }

    public void setBatch(int batch) {
        this.batch = batch;
    }

    public int getSemesterNo() {
        return semesterNo;
    }

    public void setSemesterNo(int semesterNo) {
        this.semesterNo = semesterNo;
    }

    public String getRegisteredName() {
        return registeredName;
    }

    public void setRegisteredName(String registeredName) {
        this.registeredName = registeredName;
    }
}
