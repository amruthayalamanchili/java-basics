package com.amrutha.filePack;
import java.io.*;
import java.util.Scanner;

public class SampleFile{
    public static void main(String [] args) throws FileNotFoundException,IOException {
        byte [] data = new byte[10];
        Scanner input = new Scanner(System.in);
        //OutputStream writer = null;
        File file = new File("C:\\Users\\chowd\\development\\java-basics\\Practice-file");
        //Any resource that is auto closeable we can use try with resource
        try (OutputStream writer = new FileOutputStream(file)) {
            System.out.println("enter the data:");
            writer.write(input.nextLine().getBytes());
            //finally {
            //writer.close();
            System.out.println("File Closed");
            // }

            //for(int i = 0;i<4;i++){
            //data= Integer.parseInt(input.nextLine());

            //}


            //System.out.println("data entered: " + data);
        }
    }
}
