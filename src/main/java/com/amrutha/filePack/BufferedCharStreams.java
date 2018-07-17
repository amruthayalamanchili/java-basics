package com.amrutha.filePack;

import java.io.*;
import java.util.Scanner;

public class BufferedCharStreams {
    public static void main(String [] args) throws IOException{
        char [] c = new char[10];
        Scanner input = new Scanner(System.in);
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("note3.txt"))){
            System.out.println("enter the name:");
            writer.write(input.nextLine());
        }
        String l;
        try(BufferedReader reader = new BufferedReader((new FileReader("note3.txt")))){
            while((l = String.valueOf(reader.read(c))) != null){
                System.out.println(c);
            }
        }
    }
}
