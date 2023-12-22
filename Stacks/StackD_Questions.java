package Stacks;

// import java.util.LinkedList;
import java.util.Stack;

import LOOPS.star;

import java.util.LinkedList;

import Linked_LIST.CircularLL.Node;

// import Linked_LIST.CircularLL.Node;
public class StackD_Questions {
    static class Node {
        Character data;
        Node next;

        public Node(Character data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public boolean isPalindrome(Node head) {
        Stack<Character> s = new Stack<>();
        Node slow = head;
        boolean isPalindrome = true;
        while (slow != null) {
            s.push(slow.data);
            slow = slow.next;
        }

        while (head != null) {
            char ch = s.pop();
            if (head.data == ch) {
                isPalindrome = true;
            } else {
                isPalindrome = false;
                break;
            }
            head = head.next;
        }
        return isPalindrome;
    }

    public static String simplyfyPath (String str){
        Stack <String> s = new Stack<>();
        StringBuilder res = new StringBuilder();
        String p[] = str.split("/");

        for (int i = 0; i < p.length; i++) {
            if (!s.isEmpty() && p[i].equals("..")) {
                s.pop();
            } else if (!p[i].equals("") && !p[i].equals("..")&& !p[i].equals(".")) {
                s.push(p[i]);
            }
        }

        if (s.isEmpty()) {
            return "/";
        }

        while (!s.isEmpty()) {
            res.insert(0, s.pop()).insert(0, "/");
        }
        return res.toString();
     }


     public static String decoder(String str){

        Stack <Integer> countStack = new Stack<>();
        Stack <String> resStack = new Stack<>();
        int idx = 0 ;
        String res = "" ;

        while (idx < str.length()) {
            if (Character.isDigit(str.charAt(idx))) {
                int count = 0;
                while (Character.isDigit(str.charAt(idx))) {
                   count = 10 * count + (str.charAt(idx) - '0');
                    idx++;
                    }
                    countStack.push(count);
            }

            else if (str.charAt(idx) == '[') {
                resStack.push(res);
                res = "";
                idx++;
            }
            else if (str.charAt(idx) == ']') {
                StringBuilder temp = new StringBuilder(resStack.pop());
                int repeat = countStack.pop();
                for(int i = 0 ; i < repeat ; i++){
                    temp.append(res);
                }
                res = temp.toString();
                idx++;
            }
            else {
                res += str.charAt(idx);
                idx++;
            }
        }
        return res ;
     }


     public static int maxWater(int height[]){  // doubt 
      
            Stack<Integer> stack = new Stack<>();
            int n = height.length;
            int ans = 0;
            for (int i = 0; i < n; i++) {
                while ((!stack.isEmpty()) && (height[stack.peek()] < height[i])) {
                    int pop_height = height[stack.peek()];
                    stack.pop();
                    if (stack.isEmpty()) {
                        break;
                    }
                    int distance = i - stack.peek() - 1;
                    int min_height = Math.min(height[stack.peek()], height[i]) - pop_height;
                    ans += distance * min_height;
                }
                stack.push(i);
            }
            return ans;
        }


   
  
        
        
     
    public static void main(String[] args) {
        // LinkedList<Character> ll = new LinkedList<>();
        // StackD_Questions sll = new StackD_Questions();

        // Node one = new Node('A');
        // Node two = new Node('B');
        // Node three = new Node('C');
        // Node four = new Node('B');
        // // Node five = new Node('A');
        // one.next = two;
        // two.next = three;
        // three.next = four;
        // // four.next = five;
        // System.out.println(sll.isPalindrome(one));



        // Simplyfypath Code
        // String str = "/a/./b/../../c/";
        // System.out.println(simplyfyPath(str));

        // Decoder of a string
        // String str = "3[a2[c]]";
        // System.out.println(decoder(str));

        int height[] = {7,0,4,2,5,0,6,4,0,6};
        System.out.println(trap(height));

    }
}
