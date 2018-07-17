package com.amrutha.DataStreams;

import java.io.*;
import java.util.Scanner;

public class DataStreamXample {
    public static void main(String [] args) throws IOException{
       // Scanner input = new Scanner(System.in);
        try(DataOutputStream writer = new DataOutputStream((new FileOutputStream("C:\\Users\\chowd\\development\\java-basics\\note4.txt")))){
            //System.out.println("enter your inputs:");
            writer.writeInt(12);
            writer.writeByte(23);
            writer.writeBoolean(true);
            writer.writeChar('a');
            writer.writeDouble(34.45);
            writer.writeFloat((float) 4.4);
            writer.writeLong(23456);
            writer.writeShort(23);
            writer.writeUTF("ేాీూహమప్ేే");

        }catch(EOFException e){
            System.out.println(e);
        }
        try(DataInputStream reader = new DataInputStream((new FileInputStream("C:\\Users\\chowd\\development\\java-basics\\note4.txt")))){

            System.out.println(reader.readInt());
            System.out.println(reader.readByte());
            System.out.println(reader.readBoolean());
            System.out.println(reader.readChar());
            System.out.println(reader.readDouble());
            System.out.println(reader.readFloat());
            System.out.println(reader.readLong());
            System.out.println(reader.readShort());
            System.out.println(reader.readUTF());

        }catch (EOFException e){
            System.out.println(e);
        }

    }
}
