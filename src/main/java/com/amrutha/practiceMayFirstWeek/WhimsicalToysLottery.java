package com.amrutha.practiceMayFirstWeek;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class WhimsicalToysLottery {
    private String firstname,lastname;
    Random randomName = new Random();

    public WhimsicalToysLottery(String firstname,String lastname){
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public WhimsicalToysLottery() {

    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof WhimsicalToysLottery)) return false;

        WhimsicalToysLottery that = (WhimsicalToysLottery) o;

        if (!firstname.equals(that.firstname)) return false;
        return lastname.equals(that.lastname);
    }

    @Override
    public int hashCode() {
        int result = firstname.hashCode();
        result = 31 * result + lastname.hashCode();
        return result;
    }

    @Override

    public String toString() {
        return  firstname  +"     " +
                 lastname  ;
    }

    public WhimsicalToysLottery getRandomName(List<WhimsicalToysLottery> employeeList){
        int index = randomName.nextInt(employeeList.size());
        return employeeList.get(index);
    }

}
