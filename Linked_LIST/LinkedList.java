package Linked_LIST;
public class LinkedList{
    public static class Node{
        int data ;
        Node next ;
        public Node(int data){
            this.data = data;
            this.next = null;
        }

    } 

    public static Node head;
    public static Node tail;
    public static int size ;

    public void addFirst(int data){
        // step1 = create new node
        Node newNode = new Node(data);
        size++;

        if(head == null){
            head = tail = newNode;
            return ;
        }
        // step 2 - newNode next = head;
        newNode.next = head; // Link

        //step 3 - head = newNode
        head = newNode;

    } 
    
    public void addLast(int data){
        Node newNode = new Node(data); // step 1
        size++;
        if(head == null)  {
            head = tail = newNode;
            return ;
        } 
        
         tail.next = newNode;// step 2
        tail = newNode; // step 3
    
    }

    public void print(){
        if(head == null){
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        //O(n)
        while(temp != null){
           
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void add(int idx , int data){
        if(idx == 0){
            addFirst(data);
            return;
        }
        
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        while(i < idx-1){
            temp = temp.next;
            i++;
        }
        // i = idx-1 -> temp(prev)
       
        newNode.next = temp.next;
        temp.next = newNode;
        
    }


    public int removeFirst(){
        if(size == 0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if(size == 1) {
            int val = head.data;
            head = tail = null ;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size -- ;
        return val;
    }

    public int removeLast(){
        if(size == 0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }   else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        //prev : i = size -2 
        Node prev = head;
        for(int i =0 ; i < size-2 ; i++){
            prev = prev.next;
        }

        int val = prev.next.data; // tail.data
        prev.next = null;
        tail= prev;
        size--;
        return val;
         
    }

    public  int itrSearch(int key){  //O(n)
    
        int i = 0;
        Node temp = head;
        while(temp!= null){
            if(temp.data == key){
                return i; // key found
            }
            temp = temp.next;
            i++;
        }
        return -1;  // Not Found
    }

    public int helper(Node head , int key){ //O(n)
        if(head == null){
            return -1;
        }
        if(head.data == key){
            return 0;
        }

        int idx = helper(head.next, key);
        if(idx == -1){
            return -1 ;
        }
        return idx +1 ;
    }
    public int recSearch(int key){
        return helper(head, key);
    }


    public void reverse(){
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;

    }


    public void deleteNthFromEnd(int n){
        // calculaye size
        int sz = 0;
        Node temp = head ;
        while(temp != null){
            temp = temp.next;
            sz++;
        }

        if(sz == n){
            head = head.next; // remove First
            return;
        }
        // sz -n
        int i =1;
        int itoFind = sz-n;
        while(i < itoFind){
            
        }


    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        
        ll.addFirst(2); // O(1)
        ll.addFirst(1);
        
        ll.addLast(4);
        ll.addLast(5);
        ll.add(2, 3);
        
        ll.print();
        
    //    ll.removeFirst();
    //    ll.print();

    //    ll.removeLast();
    //    ll.print();
    //    System.out.println(ll.size);

        // System.out.println(ll.recSearch(3));
        // System.out.println(ll.recSearch(9));
    
        ll.reverse();
        ll.print();
        


    }
}