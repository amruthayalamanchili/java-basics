package com.amrutha.filePack;

import java.io.Reader;
import java.io.IOException;
import java.io.Writer;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class CharacterStream {
    public static void main(String [] args) throws IOException{
        Scanner input = new Scanner(System.in);
        Boolean decision = null;

        try(Writer write = new FileWriter("C:\\Users\\chowd\\development\\java-basics\\note1")){
            do{
                System.out.println("Enter your input:");
                String value;
                value =input.nextLine();
                write.write(value);
                write.write(String.valueOf((System.lineSeparator())));
                System.out.println("do you want to continue:");
                decision = Boolean.valueOf(input.nextLine());
            }while(decision);
        }
        int charsRead = 0;
        char [] chars = new char[4];
        try(Reader reader = new FileReader("C:\\Users\\chowd\\development\\java-basics\\note1")){
            while((charsRead = reader.read(chars)) != -1){
                String str = new String(chars,0,charsRead);
                System.out.println(str);
            }
        }
    }
}
