package com.PassleyArt.payroll_management;

public class SalesRep extends StaffMember{

    private double allowance;

    public SalesRep(){

        allowance=0;
    }

    public SalesRep(double allowance){
        this.allowance=allowance;
    }

    //setters
    public void setAllowance(double allowance){
        this.allowance = allowance;
    }

    //getters
    public double getAllowance(){
        return allowance;
    }

    public void display() {
        System.out.println("First Name :" + firstName + "\n" +
                "Last Name: " + lastName + "\n" +
                "Dept #: " + deptNumber + "\n" +
                "Hours Worked: " + hoursWorked + "\n" +
                "Allowance: " + allowance + "\n");
    }
}
