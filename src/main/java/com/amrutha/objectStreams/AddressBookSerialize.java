package com.amrutha.objectStreams;

import java.io.*;

public class AddressBookSerialize implements Serializable{
    String name  ;
    int streetNo ;
    String streetName ;
    String city ;
    String state ;
        public AddressBookSerialize(String name,int streetNo,String streetName,String city,String state){
            this.name = name;
            this.streetNo = streetNo;
            this.streetName = streetName;
            this.city = city;
            this.state = state;
            }


    public static void main(String [] args) throws IOException{
            AddressBookSerialize book = new AddressBookSerialize("sandy",2345,"archgate","sandysprings","georgia");
        try(ObjectOutputStream writer = new ObjectOutputStream(new FileOutputStream("C:\\Users\\chowd\\development\\java-basics\\fileX.txt"))){
            writer.writeObject(book);
        }
        try(ObjectInputStream reader = new ObjectInputStream((new FileInputStream("C:\\Users\\chowd\\development\\java-basics\\fileX.txt")))){
            System.out.println((AddressBookSerialize)reader.readObject());
            System.out.println(book.name);
            System.out.println(book.streetNo);
            System.out.println(book.streetName);
            System.out.println(book.city);
            System.out.println(book.state);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
