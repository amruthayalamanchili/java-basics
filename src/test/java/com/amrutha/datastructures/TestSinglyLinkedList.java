package com.amrutha.datastructures;

public class TestSinglyLinkedList {
    public static void main(String [] args){
        SinglyLinkedList list = new SinglyLinkedList();
        SinglyLinkedList.SinglyLinkedListNode item1 = new SinglyLinkedList.SinglyLinkedListNode(1);
        SinglyLinkedList.SinglyLinkedListNode item2 = new SinglyLinkedList.SinglyLinkedListNode(3);
        SinglyLinkedList.SinglyLinkedListNode item3 = new SinglyLinkedList.SinglyLinkedListNode(2);
        SinglyLinkedList.SinglyLinkedListNode item4 = new SinglyLinkedList.SinglyLinkedListNode(5);
        SinglyLinkedList.SinglyLinkedListNode item5 = new SinglyLinkedList.SinglyLinkedListNode(6);
        SinglyLinkedList.SinglyLinkedListNode item6 = new SinglyLinkedList.SinglyLinkedListNode(7);
        list.insertFirst(item1);
        list.insertFirst(item2);
        list.insertFirst(item3);
        list.insertFirst(item4);
        list.insertLast(item5);
        list.insertLast(item6);
        //list.deleteFirst();
        list.deleteLast();
        list.traverseList();



    }
}
