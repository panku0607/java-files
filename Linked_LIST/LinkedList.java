package Linked_LIST;

public class LinkedList {
    public static class Node {

        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size ;

    public void addFirst(int data) {  // O(1)

        
        // step -1 = create a new node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // step 2 -- newNode next = head;
        newNode.next = head; // Link

        // step3 - head = newNode
        head = newNode;
    }


    public void addLast (int data){  // O(1)
        // create a new node
        Node newNode = new Node(data);
        size ++ ;
        if (head== null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;

    }


    public void print(){  //O(n)
        if (head == null) {
            System.out.println("LL is empty");
            return;
        }

        Node temp =head;
        while (temp!= null) {
            System.out.print(temp.data+ "->");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public void add(int idx , int data){
            if (idx == 0) {
                addFirst(data);
                return;
            }
        int i = 0; 
        Node newNode = new Node(data);
        size++;
        Node temp = head ;

        
        while (i < idx-1) {
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst(){
        if (size ==0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if(size == 1){
            int val = head.data ;
            head = tail = null;
            size = 0;
            return val;
        }

        int val = head.data;
        head = head.next;
        size--;
        return val;
    }


    public int removeLast (){
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        // prev : i = size -2
        Node prev = head;
         for (int i = 0 ; i < size -2 ; i++) {
            prev = prev.next;
        }

        int val = prev.next.data; // tail data
        prev.next = null ;
        tail = prev ;
        size--;
        return val;
    }

    public int itrSearch(int key){

        Node temp = head;
        int i = 0; 

        while (temp != null) {
            if (temp.data == key) {
                return i ;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    public int helper(Node head , int key){  //O(n)
        // basecase
        if (head == null) {
            return -1 ;
        }

        if (head.data == key) {
            return 0 ;
        }
       int idx =  helper(head.next, key);
       if (idx == -1) {
            return -1;
       }

        return idx + 1;

    }
    public int recSearch(int key){
        return helper(head, key);
    }


    public void reverse(){  //O(n)
        Node prev = null ;
        Node curr = tail = head;
        Node next;

        while (curr != null) {
            next = curr.next ;
            curr.next = prev ;
            prev = curr;
            curr = next;
        }
        head = prev ;
    }


    public void deleteNthfromEnd(int n){
        int sz = 0 ; 
        Node temp = head;
       
        while (temp != null) {
            temp = temp.next;
            sz ++;
        }

        if (n == sz) {
            head = head.next;  // first-remove
            return;
        }

        int i = 1;
        int toFind = sz - n ;
        Node prev = head;
        while (i < toFind) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }


    public  Node findMid(Node head){
        Node slow = head;
        Node fast = head ;

        while (fast != null && fast.next != null) {
            slow = slow.next;       // +1 
            fast = fast.next.next;   // +2 
        }

        return slow; // slow is my mid node 
    }


    public boolean checkpalindrome(){
        // basecase
        if (head == null || head.next == null) {
            return true;
        }

        // step-1 find mid
        Node midNode = findMid(head);
        // step -2 reverse 2nd half 

        Node prev = null ;
        Node curr = midNode;
        Node next ;
        while (curr != null) {
            next = curr.next;
            curr.next =prev;
            prev = curr; 
            curr = next ;
        }
        // check left half and right half

        Node left = head;
        Node right = prev;  // kyuki while loop end hone pr prev = right par hoga

        while (right != null) {
            if (left.data != right.data) {
                return false ;
            }  
                left = left.next;
                right = right.next;
            
        }
        return true;
    }

    public static boolean isCycle(){
        Node slow = head; 
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next ;  // +1
            fast = fast.next.next; // +2

            if (slow == fast) {
                return true ;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        LinkedList ll = new LinkedList();
       
        // ll.addFirst(2);
      
        // ll.addFirst(1);
      
        // ll.addLast(4);
      
        // ll.addLast(5);
      
        // ll.add(2, 3);
        //  ll.print(); // 1->2->3->4->5
        
        // // ll.removeFirst() ;
        // // ll.print(); 
        // // ll.removeLast();
        // // ll.print();
        // // System.out.println(size);

        // // System.out.println(ll.recSearch(3));
        // // System.out.println(ll.recSearch(10));

        // // ll.reverse();
        // // ll.print();
        // ll.deleteNthfromEnd(3);
        // ll.print();


        // ll.addLast(1);
        // ll.addLast(2);
        // ll.addLast(2);
        // ll.addLast(1);
        // System.out.println(ll.checkpalindrome());

        head = new Node(1);
        head.next = new node(2);
        head.next.next = new node(3);
        head.next.next.next = head;
        // 1 -> 2 - > 3
        System.out.println(isCycle());

        




    }
}