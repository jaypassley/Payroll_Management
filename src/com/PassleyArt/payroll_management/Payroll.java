package com.PassleyArt.payroll_management;

import java.util.Scanner;

public class Payroll {

    public static void main(String[] args) {


    Scanner myObj = new Scanner(System.in);


    Manager Obj1 = new Manager();   //create object of Manager
    //SalesRep obj2 = new SalesRep();  //create object of SalesRep

    //start accepting input from user via scanner.
        System.out.println("Enter First Name");
        Obj1.setFirstName(myObj.next());

        System.out.println("Enter Last Name");
        Obj1.setLastName(myObj.next());

        System.out.println("Enter Dept #");
        Obj1.setDeptNumber(myObj.next());

        System.out.println("Enter Hours Worked");
        Obj1.setHoursWorked(myObj.nextDouble());

        System.out.println("Enter Bonus");
        Obj1.setBonus(myObj.nextDouble());
    // end of user input

    //Display Client info with Card
        System.out.println("\nManager Info\n");
        Obj1.display();

}
}
