package com.PassleyArt.payroll_management;

/* Group members: Nashorn Passley 1400162306
                  Latona Levy 1917010761
                  Ramon Francis 1400137487
                          */


public class Manager extends StaffMember {

    private double bonus;


    @Override
    double calculateSalary() {
        double Salary = ((hoursWorked * 2500) + bonus);
        return Salary;
    }

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
                "Bonus: " + bonus + "\n" +
                "Salary: " + calculateSalary() + "\n");
    }

}
