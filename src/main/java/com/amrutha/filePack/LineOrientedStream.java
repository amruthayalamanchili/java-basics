package com.amrutha.filePack;

import java.io.*;

public class LineOrientedStream {
    public static void main(String [] args) throws IOException{


        BufferedReader reader = null;
        PrintWriter writer = null;
        try{
        reader = new BufferedReader(new FileReader("filePractice1.txt"));
        writer = new PrintWriter(new FileWriter("characterOutput.txt")) ;
            String l ;
            while((l = reader.readLine()) != null){
                writer.println(l);
                System.out.println(l);

            }
        }finally{
            if(reader != null){
                reader.close();
            }
            if(writer != null){
                writer.close();
            }


        }


    }
}
