package com.PassleyArt.payroll_management;

/* Group members: Nashorn Passley 1400162306
                  Latona Levy 1917010761
                  Ramon Francis 1400137487
                          */

import java.util.Scanner;

public class Payroll {

    public static void main(String[] args) {


        Scanner myObj = new Scanner(System.in);


        //StaffMember Obj1 = new StaffMember();   //create object of StaffMember
        Manager Obj2 = new Manager();  //create object of Manager
        SalesRep Obj3 = new SalesRep();  //create object of SalesRep


//    //start accepting input for Staff Member.
//        System.out.println("Enter First Name");
//        Obj1.setFirstName(myObj.next());
//
//        System.out.println("Enter Last Name");
//        Obj1.setLastName(myObj.next());
//
//        System.out.println("Enter Dept #");
//        Obj1.setDeptNumber(myObj.next());
//
//        System.out.println("Enter Hours Worked");
//        Obj1.setHoursWorked(myObj.nextDouble());
//
//
//    //Display Staff info
//        System.out.println("\nStaff Member Info\n");
//        Obj1.display();
//
//        //*********************
//
//        StaffMember[] staffMembers = {
//                new StaffMember("Jay","Passley","ICT-01",40),
//                new StaffMember("tina","clarke","DBT-02",45),
//                new StaffMember("Caleb","Jones","MTH-03",38),
//                new StaffMember("Jonah","Blake","SCI-04",42),
//                new StaffMember("Asha","May","ENT-05",58)
//
//        };
//
//        System.out.println("\n***StaffMembers Info***");
//        //staffMemberList.forEach(System.out::println);
//
//        for(StaffMember obj: staffMembers) {
//            System.out.println(obj);
//        }

        //*********************

        //Enter input for Manager
        System.out.println("\nEnter Payroll Info For a Manager\n********************************\n");

        System.out.println("Enter First Name");
        Obj2.setFirstName(myObj.next());

        System.out.println("Enter Last Name");
        Obj2.setLastName(myObj.next());

        System.out.println("Enter Dept #");
        Obj2.setDeptNumber(myObj.next());

        System.out.println("Enter Hours Worked");
        Obj2.setHoursWorked(myObj.nextDouble());

        System.out.println("Enter Bonus");
        Obj2.setBonus(myObj.nextDouble());

        //Display Manger info
        System.out.println("\nManager Info\n");
        Obj2.display();

        //*********************

        //Enter input for SalesRep
        System.out.println("\nEnter Payroll Info For a Sales Rep\n********************************\n");

        System.out.println("Enter First Name");
        Obj3.setFirstName(myObj.next());

        System.out.println("Enter Last Name");
        Obj3.setLastName(myObj.next());

        System.out.println("Enter Dept #");
        Obj3.setDeptNumber(myObj.next());

        System.out.println("Enter Hours Worked");
        Obj3.setHoursWorked(myObj.nextDouble());

        System.out.println("Enter Allowance");
        Obj3.setAllowance(myObj.nextDouble());

        //Display Sales Rep info
        System.out.println("\nSalesRep Info\n");
        Obj3.display();


    }
}
