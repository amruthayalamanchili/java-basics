package com.amrutha.socketPack;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerXample {
    public static void main(String [] args) throws IOException {
        int number,temp;
        ServerSocket server = new ServerSocket(2345);
        Socket s1 = server.accept();
        Scanner sc = new Scanner(s1.getInputStream());
        number = sc.nextInt();
        System.out.println("client passed :" + number);
        temp = (number * 4) +2;
        PrintStream p = new PrintStream(s1.getOutputStream());
        p.println(temp);


    }
}
