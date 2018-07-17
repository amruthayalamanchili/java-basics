package com.amrutha.filePack;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class CopyCharacters {

        public static void main(String[] args) throws IOException {

            FileReader inputStream = null;
            FileWriter outputStream = null;

            try {
                inputStream = new FileReader("filePractice1.txt");
                outputStream = new FileWriter("characteroutput.txt");

                int c;
                while ((c = inputStream.read()) != -1) {
                    outputStream.write(c);
                    System.out.println(c);
                }
            } finally {
                if (inputStream != null) {
                    inputStream.close();
                }
                if (outputStream != null) {
                    outputStream.close();
                }
            }
        }
    }

