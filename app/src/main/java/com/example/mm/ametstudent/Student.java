package com.example.mm.ametstudent;

public class Student {

    private String mName, mAddress;

    private int mPhone, mSection;

    public Student(String mName, String mAddress, int mPhone, int mSection) {
        this.mName = mName;
        this.mAddress = mAddress;
        this.mPhone = mPhone;
        this.mSection = mSection;
    }

    public String getmName() {
        return mName;
    }

    public String getmAddress() {
        return mAddress;
    }

    public int getmPhone() {
        return mPhone;
    }

    public int getmSection() {
        return mSection;
    }
}
