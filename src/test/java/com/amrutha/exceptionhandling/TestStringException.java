package com.amrutha.exceptionhandling;

import java.io.FileNotFoundException;

public class TestStringException {
    public static void main(String [] args){
        StringException st = new StringException();
        //String s1 = st.stringConversion("Hello");
       // int s2 = st.multiplyMethod(3,2);
        String s3 = st.readFileContents("C:\\Users\\chowd\\Documents\file.txt");
       // System.out.println(s1);
       // System.out.println(s2);
        //System.out.println(s3);
    }

}
