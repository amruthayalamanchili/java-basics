package com.amrutha.socketPack;

import java.io.*;
import java.net.Socket;

public class EchoServer {
    public static void main(String [] args) throws IOException {
        String hostName = args[0];
        int portNumber = Integer.parseInt(args[1]);
        Socket s = new Socket(hostName,portNumber);
        try(PrintWriter out = new PrintWriter(s.getOutputStream(),true);
        BufferedReader in = new BufferedReader(new InputStreamReader((s.getInputStream())));
        BufferedReader stdIn = new BufferedReader((new InputStreamReader(System.in)));
        ){

        }
    }
}
