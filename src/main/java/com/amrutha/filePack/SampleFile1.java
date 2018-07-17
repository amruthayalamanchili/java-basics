package com.amrutha.filePack;

import java.io.*;
import java.util.Scanner;

import static java.lang.String.*;

public class SampleFile1 {
    public static void main(String [] args) throws FileNotFoundException,IOException{
        Byte [] data = new Byte[10];
        int i = -1;
        Boolean decision = null;
        Scanner input = new Scanner(System.in);
        try(OutputStream writer = new FileOutputStream("C:\\Users\\chowd\\development\\java-basics\\Practice-file")){
            do{
                System.out.println("enter the data:");
                writer.write( input.nextLine().getBytes());
                writer.write((System.lineSeparator().getBytes()));
                System.out.println("do you want to continue");
                decision = Boolean.valueOf(input.nextLine());

            }  while(decision);
        }
        try(InputStream reader = new FileInputStream("C:\\Users\\chowd\\development\\java-basics\\Practice-file")){
            int value = 0;
            byte [] b = new byte[6];
            while ((value = reader.read(b)) != -1){
                System.out.println(new String(b,0,value));
            }
            reader.close();

        }

    }

    }


