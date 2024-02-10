package Linked_LIST;

import LOOPS.star;

public class Revision {
    
    static class  LinkedList {
       
        static class Node{
            int data;
            Node next;

             public Node (int data){
                this.data = data;
                this.next = null;
             }
            }
             public static Node head;
             public static Node tail;


             public void add(int data){
                Node newNode = new Node(data);
                 if (head == null) {
                head = tail = newNode;
                 }

                 newNode.next = head;
                 head = newNode;
}

        }
        
    
    public static void main(String[] args) {
        

    }
}
