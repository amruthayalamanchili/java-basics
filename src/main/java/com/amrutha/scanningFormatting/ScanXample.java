package com.amrutha.scanningFormatting;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Locale;
import java.util.Scanner;

public class ScanXample {
    public static void main(String [] args)throws FileNotFoundException{

        try(Scanner s = new Scanner(new BufferedReader(new FileReader("C:\\Users\\chowd\\development\\java-basics\\mytextFile.txt")))){
            s.useLocale(Locale.getDefault());
            while(s.hasNext()){
                //s.useDelimiter("\\s*,\\s*"); //token seperator to be comma ,optionally followed by white space
                System.out.println(s.next());
            }
        }
    }
}
