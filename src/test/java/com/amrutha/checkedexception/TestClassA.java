package com.amrutha.checkedexception;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLDataException;

public class TestClassA {
    public static void main(String [] arg){
        ClassA a = new ClassA();
        try{
            a.methodA();
            a.methodB();
        }catch(Exception e){
            //For exceptions instanceof is not a good approach because we can use catch block instead of instanceof
            if(e instanceof  FileNotFoundException){
                System.out.println("file Not found Exception");
            }else if(e instanceof IOException){
                System.out.println("IOExcetion");
            }else {
                System.out.println(" other  Exception handled" + e.getMessage());
            }


        }/*catch(FileNotFoundException e1){

        }catch(IOException e2){

        }*/
    }
}
