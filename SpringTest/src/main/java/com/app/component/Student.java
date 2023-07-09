package com.app.component;

public class Student {
    private int sId;
    private String sName;
    private int sRoll;

    public Student() {
    }

    public int getsId() {
        return sId;
    }

    public void setsId(int sId) {
        this.sId = sId;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public int getsRoll() {
        return sRoll;
    }

    public void setsRoll(int sRoll) {
        this.sRoll = sRoll;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sId=" + sId +
                ", sName='" + sName + '\'' +
                ", sRoll=" + sRoll +
                '}';
    }
}
