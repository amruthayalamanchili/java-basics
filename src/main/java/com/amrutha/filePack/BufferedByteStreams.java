package com.amrutha.filePack;

import java.io.*;
import java.util.Scanner;

public class BufferedByteStreams {
    public static void main(String [] args) throws IOException {
        byte [] b = new byte[10];
        Scanner input = new Scanner(System.in);

        try(BufferedOutputStream writer = new BufferedOutputStream(new FileOutputStream("C:\\Users\\chowd\\development\\java-basics\\buffer.txt"))) {

            System.out.println("enter the value:");
            writer.write(input.nextLine().getBytes());
        }
        int value = 0;
        try(BufferedInputStream reader = new BufferedInputStream(new FileInputStream("C:\\Users\\chowd\\development\\java-basics\\buffer.txt"))){
            while((value = reader.read(b)) != -1){
                System.out.println(new String(b));
            }
        }
    }
}
