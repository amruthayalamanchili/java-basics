package com.amrutha.socketPack;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerSocketXample {
    public static void main(String [] args) throws IOException {
        Scanner input = new Scanner(System.in);
        try(ServerSocket server = new ServerSocket(234)){
            Socket client = server.accept();
            PrintWriter writer = new PrintWriter(client.getOutputStream());
            DataInputStream reader = new DataInputStream(client.getInputStream());
            Boolean decision = null;
            do{
                System.out.println("message from server:");
                String in = input.nextLine();
                writer.write(in);
                System.out.println(reader.readUTF());
                System.out.println("do you want to continue?");
                decision = Boolean.valueOf(input.nextLine());
            }while(decision);



        }
    }
}
