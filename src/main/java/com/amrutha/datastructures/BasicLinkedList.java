package com.amrutha.datastructures;

import java.util.Scanner;

public class BasicLinkedList {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        Node a = new Node();
        Node b = new Node();
        Node c = new Node(); // creation of nodes
        //inserting data into nodes
        System.out.println("enter a:");
        a.data = S.nextInt();
        System.out.println("enter b:");
        b.data = S.nextInt();
        System.out.println("enter c:");
        c.data = S.nextInt();

        // linking the nodes
        a.node = b;
        b.node = c;

        //printing the values of the list
        System.out.println("list of elements");
        while (a!=null){
            System.out.print( a.data + "-->");
            a = a.node;
        }
    }


     static class Node{
        int data; // first field of the node
        Node node; // next pointer field
        public Node(){
            this.node = null;
        }

    }
}

