package com.amrutha.exceptionhandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class StringException {
    public StringException( ){
    }

    public String readFileContents(String filepath){
       try{
           File file = new File(filepath);
           FileInputStream fileInpurStream = new FileInputStream(file);
       }catch(FileNotFoundException e){
           System.out.println("caught file not found exception");
           throw new InvalidInputException(e);
           //e.printStackTrace();
       }
       finally{
           System.out.println("Read file method");
       }
       return "Sample";
    }

   /* public int multiplyMethod(int a,int b){
       try{
       }finally{
           System.out.println("first try block");
       }
        try{
            try{

            }finally{
                return 11;
            }
           // throw new InvalidInputException("Invalid Inputs");
        }finally{
            return 10;
        }
    }

    public String stringConversion(String s){
        if(s == null){
            throw new InvalidInputException("Given input is null.Give some value");
        }
        return s.toLowerCase();
    }*/
}
