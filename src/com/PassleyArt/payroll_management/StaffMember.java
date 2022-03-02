package com.PassleyArt.payroll_management;

public class StaffMember {

    String firstName;
    String lastName;
    String deptNumber;
    double hoursWorked;

public StaffMember() {
  firstName="";
  lastName="";
  deptNumber="";
  hoursWorked=0;

}

public StaffMember(String firstName,String lastName, String deptNumber, double hoursWorked){
    this.firstName=firstName;
    this.lastName=lastName;
    this.deptNumber=deptNumber;
    this.hoursWorked=hoursWorked;
}

    //setters
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setDeptNumber(String deptNumber) {
        this.deptNumber = deptNumber;
    }
    public void setHoursWorked(double hoursWorked){
        this.hoursWorked = hoursWorked;
    }

    //getters
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getDeptNumber(){
        return deptNumber;
    }
    public double getHoursWorked(){ return hoursWorked; }


    public void display() {
        System.out.println("First Name :" + firstName + "\n" +
                "Last Name: " + lastName + "\n" +
                "Dept #: " + deptNumber + "\n" +
                "Hours Worked: " + hoursWorked + "\n");
    }
    @Override
    public String toString(){
    return this.firstName + " " + this.lastName + " | " + this.deptNumber + " | " + this.hoursWorked + " hrs";

    }
}
