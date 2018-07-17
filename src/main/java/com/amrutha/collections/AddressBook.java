package com.amrutha.collections;

public class AddressBook{
    private String name;
    private int streetNumber;
    private String streetName;
    private String city;

     public AddressBook(String name,int streetNumber,String streetName,String city){
         this.name = name;
         this.streetNumber = streetNumber;
         this.streetName = streetName;
         this.city = city;
     }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AddressBook)) return false;

        AddressBook that = (AddressBook) o;

        if (streetNumber != that.streetNumber) return false;
        if (!name.equals(that.name)) return false;
        if (!streetName.equals(that.streetName)) return false;
        return city.equals(that.city);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + streetNumber;
        result = 31 * result + streetName.hashCode();
        result = 31 * result + city.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "AddressBook{" +
                "name='" + name + '\'' +
                ", streetNumber=" + streetNumber +

                ", streetName='" + streetName + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
/* public void setName(String name) {
        this.name = name;
    }

    public void setStreetNumber(int streetNumber) {
        this.streetNumber = streetNumber;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public void setCity(String city) {
        this.city = city;
    } */

    public String getName() {
        return name;
    }

    public int getStreetNumber() {
        return streetNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public String getCity() {
        return city;
    }
}
