package com.company;

public class Main {
    private int DOB=1995;
    private int Year=2017;
    private int age=22;

    public void ChangeDOB(int newDOB){
        DOB=newDOB;

    }

    public void CheckAge(){
        int actualage=(Year-DOB);
        System.out.println(actualage);
    }
}
Main Dude = new Main();
Dude.CheckAge();
Dude.ChangeDOB(1993);
Dude.CheckAge();