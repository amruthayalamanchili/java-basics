package com.amrutha.practiceMayFirstWeek;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class TestWhimsicalToyslottery {
    public static void main(String [] args){
        WhimsicalToysLottery employee = new WhimsicalToysLottery();
        WhimsicalToysLottery employee1 = new WhimsicalToysLottery("Sally","Hansen");
        WhimsicalToysLottery employee2 = new WhimsicalToysLottery("Steve","Jhonson");
        WhimsicalToysLottery employee3 = new WhimsicalToysLottery("James","Bond");
        WhimsicalToysLottery employee4 = new WhimsicalToysLottery("Jackie","Chan");
        WhimsicalToysLottery employee5 = new WhimsicalToysLottery("Steve","Haidi");
        WhimsicalToysLottery employee6 = new WhimsicalToysLottery("James","Puppady");
        Date date = new Date();
        List<WhimsicalToysLottery> employeeList = new ArrayList();
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);
        employeeList.add(employee5);
        employeeList.add(employee6);
        Collections.sort(employeeList,new WtiEmployeeComparator());
        System.out.println("Employees List:");
        System.out.println("FIRSTNAME LASTNAME");
        System.out.println("********* *********");
        for(WhimsicalToysLottery aEmployee : employeeList){
            System.out.println(aEmployee.toString());
        }
        System.out.println("\nRandom pick of employee for toy gift:\n" + employee.getRandomName(employeeList)+"\n" + date.toString());
    }
}
