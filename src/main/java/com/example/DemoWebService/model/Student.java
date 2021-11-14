package com.example.DemoWebService.model;

public class Student {
    private int rollid;
    private String name;
    private String branch;


    public Student(int rollid, String name, String branch) {
        this.rollid = rollid;
        this.name = name;
        this.branch = branch;
    }

    public int getRollid() {
        return rollid;
    }

    public void setRollid(int rollid) {
        this.rollid = rollid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }
}
