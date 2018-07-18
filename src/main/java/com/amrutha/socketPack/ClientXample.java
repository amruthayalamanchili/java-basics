package com.amrutha.socketPack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class ClientXample {
    public static void main(String [] args) throws IOException {
        int number,temp;
        Scanner input = new Scanner(System.in);
        Socket client = new Socket("127.0.0.1",2345);
        Scanner in = new Scanner(client.getInputStream());//to accept response from the server
        PrintStream out = new PrintStream(client.getOutputStream());//to pass value to the socket
        System.out.println("enter the number:");
        number = input.nextInt();
        out.println(number);//pass number onto the server
        temp = in.nextInt();//to accept result from server
        System.out.println("result:" + temp);
    }
}
