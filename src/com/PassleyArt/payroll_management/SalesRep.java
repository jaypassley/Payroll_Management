package com.PassleyArt.payroll_management;

/* Group members: Nashorn Passley 1400162306
                  Latona Levy 1917010761
                  Ramon Francis 1400137487
                          */

public class SalesRep extends StaffMember{

    private double allowance;

    @Override
    double calculateSalary() {
        double Salary = ((hoursWorked * 1500) + allowance);
        return Salary;
    }

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
                "Allowance: " + allowance + "\n" +
                "Salary: " + calculateSalary() + "\n");
    }
}
