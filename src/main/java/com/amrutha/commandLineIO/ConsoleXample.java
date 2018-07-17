package com.amrutha.commandLineIO;

import java.io.Console;
import java.util.Arrays;

public class ConsoleXample {
    static boolean verify(String userName,char [] oldPassword){
        switch(userName){
            case "sandy'":
                oldPassword = new char[]{'a', 'b', 'c'};
                break;
                default:
                    System.out.println("incorrect password");
                    return false;
        }
        return true;

    }
    static  void change(String userName,char [] newPassword) {

    }

    public static void main(String [] args){
        Console c = System.console();
        if(c == null){
            System.err.println("no console");
            System.exit(1);
        }
        System.out.println("PASSWORD CHANGE");
        String userName = c.readLine( "Username;");
        char [] oldPassword = c.readPassword("Password:");

        if(verify(userName,oldPassword)){
            boolean noMatch;
            do {
                char [] newPassword1 = c.readPassword("Enter your new password: ");
                char [] newPassword2 = c.readPassword("Enter new password again: ");
                noMatch = ! Arrays.equals(newPassword1, newPassword2);
                if (noMatch) {
                    c.format("Passwords don't match. Try again.%n");
                } else {
                    change(userName, newPassword1);
                    c.format("Password for %s changed.%n", userName);
                }
                Arrays.fill(newPassword1, ' ');
                Arrays.fill(newPassword2, ' ');
            } while (noMatch);
        }

        Arrays.fill(oldPassword, ' ');
    }

        }




