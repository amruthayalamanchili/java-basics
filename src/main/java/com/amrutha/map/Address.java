package com.amrutha.map;

public class Address {

    private String streetName;
    private int zipCode;
    public Address(String streetName,int zipCode){
        this.streetName = streetName;
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "streetName='" + streetName + '\'' +
                ", zipCode=" + zipCode +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Address)) return false;

        Address address = (Address) o;

        if (zipCode != address.zipCode) return false;
        return streetName != null ? streetName.equals(address.streetName) : address.streetName == null;
    }

    @Override
    public int hashCode() {
        int result = streetName != null ? streetName.hashCode() : 0;
        result = 31 * result + zipCode;
        return result;
    }
}
