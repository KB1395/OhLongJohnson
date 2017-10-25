package com.company;

public class  Ages {
    public int DOB=1995;
    public int Year=2017;
    private int age=22;

    public boolean ChangeDOB(int newDOB){
        DOB=newDOB;
        return true;

    }

    public int CheckAge(){
        int actualage=(Year-DOB);
        return actualage;
    }
}