package com.PassleyArt.payroll_management;

public class Manager extends StaffMember {

    private double bonus;


    public Manager(){
        bonus=0;

    }

    public Manager(double bonus){
        this.bonus=bonus;
    }

    //setters
    public void setBonus(double bonus){ this.bonus = bonus;
    }

    //getters
    public double getBonus(){
        return bonus;
    }

    public void display() {
        System.out.println("First Name :" + firstName + "\n" +
                "Last Name: " + lastName + "\n" +
                "Dept #: " + deptNumber + "\n" +
                "Hours Worked: " + hoursWorked + "\n" +
                "Bonus: " + bonus + "\n");
    }

}
