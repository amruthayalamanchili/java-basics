package com.amrutha.socketPack;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class ClientSocketXample {
    public static void main(String [] args) throws IOException {
         Scanner input = new Scanner((System.in));
         Boolean decision = null;

        try(Socket client = new Socket("127.0.0.1",234)){
            PrintWriter write = new PrintWriter(String.valueOf(client.getOutputStream()));
            DataInputStream reader = new DataInputStream((client.getInputStream()));
            do{
                System.out.println("Enter your request to server:");
                String in = input.nextLine();
                write.write(in);
                System.out.println(reader.readUTF());
                System.out.println("do you want to continue?");
                decision = Boolean.valueOf(input.nextLine());
            }while(decision);

        }



    }
}
