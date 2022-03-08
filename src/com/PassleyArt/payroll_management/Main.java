package com.PassleyArt.payroll_management;

/* Group members: Nashorn Passley 1400162306
                  Latona Levy 1917010761
                  Ramon Francis 1400137487
                          */




public class Main {
    public static void main(String[] args) {

        StaffMember[] staffMembers = {
                new StaffMember("Jay","Passley","ICT-01",40),
                new StaffMember("tina","clarke","DBT-02",45),
                new StaffMember("Caleb","Jones","MTH-03",38),
                new StaffMember("Jonah","Blake","SCI-04",42),
                new StaffMember("Asha","May","ENT-05",58)

        };

        System.out.println("\n***StaffMembers Info***");
        //staffMemberList.forEach(System.out::println);

        for(StaffMember obj: staffMembers) {
                    System.out.println(obj);
                }





    }
}



