package com.amrutha.datastructures;

public class SinglyLinkedList {
    private SinglyLinkedListNode head;
    private SinglyLinkedListNode tail;

    public SinglyLinkedList(){
        head = null;
        tail = null;
    }
    public void traverseList(){
        SinglyLinkedListNode temp = head;
        try{
            System.out.print("list: ");
            while(head!=null ){
                if(temp== null){
                    return ;
                }
                System.out.print( "{ "+ temp.getData()+"}");
                temp = temp.getNext();

            }
            temp.next=null;
        }catch (NullPointerException e){
            System.out.print("\n" + e);
        }

    }

    @Override
    public String toString() {
        return "SinglyLinkedList{" +
                "head=" + head +
                ", tail=" + tail +
                '}';
    }

    public void insertFirst(SinglyLinkedListNode newnode){
        if(newnode == null){
            return;
        }else {
            if(head == null){
                newnode.next = null;
                head = newnode;
                tail = newnode;
            }else {
                newnode.next = head;
                head = newnode;
            }
        }

    }
    public void insertLast(SinglyLinkedListNode newNode){
        if (newNode == null) {
            return;
        }else{
            newNode.next=null;
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                 tail.next = newNode;
                tail = newNode;
            }
            //System.out.print("tail value:" + tail);
        }
        }
        public void deleteFirst(){
        if(head==null){
            return;
        }else{
            if(head==tail){
                head=null;
                tail=null;
            }else{
                head = head.next;
            }
        }
        }

        public void deleteLast(){
        if(tail == null){
            return;
        }else{
            if(head==tail){
                head = null;
                tail = null;
            }else{
                SinglyLinkedListNode previousToTail = head;
                while (previousToTail != tail) {
                    previousToTail=previousToTail.next;
                    tail = previousToTail;
                    tail.next=null;
                }
            }
        }
        }

    static class SinglyLinkedListNode{
        public int data;
        public SinglyLinkedListNode next;

        @Override
        public String toString() {
            return "SinglyLinkedListNode{" +
                    "data=" + data +
                    '}';
        }

        public int getData() {
            return data;
        }

        public SinglyLinkedListNode getNext() {
            return next;
        }

        public SinglyLinkedListNode(int data) {
            this.data = data;
        }
    }
}
