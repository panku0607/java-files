import java.util.*;

import LOOPS.star;
import Linked_LIST.LinkedList;

public class Queue_D {

    // static class Queue {
    // static Stack<Integer> s1 = new Stack<>();
    // static Stack<Integer> s2 = new Stack<>();

    // public static boolean isEmpty() {
    // return s1.isEmpty();
    // }

    // // Add O(n)
    // public static void add(int data) {
    // while (!s1.isEmpty()) {
    // s2.push(s1.pop());
    // }

    // s1.push(data);

    // while (!s2.isEmpty()) {
    // s1.push(s2.pop());
    // }
    // }

    // public static int remove() {
    // if (isEmpty()) {
    // System.out.println("queue is empty");
    // return -1;
    // }

    // return s1.pop();
    // }

    // public static int peek() {
    // if (isEmpty()) {
    // System.out.println("queue is empty");
    // return -1;
    // }

    // return s1.peek();
    // }

    // }

    static class Stack_C {
      static Queue <Integer> q1 = new LinkedList<>();
      static Queue<Integer> q2 = new LinkedList<>();

        public static boolean isEmpty() {
            return q1.isEmpty() && q2.isEmpty();

        }

        public static void push(int data) {
            if (!q1.isEmpty()) {
                q1.add(data);
            } else {
                q2.add(data);
            }
        }

        public static int pop() {
            if (isEmpty()) {
                System.out.println("stack is empty");
                return -1;
            }
            int top = -1;
            if (!q1.isEmpty()) {
                while (!q1.isEmpty()) {
                    top = q1.remove();
                    if (isEmpty()) {
                        break;
                    }
                    q2.add(top);

                }
            } else {

                while (!q2.isEmpty()) {
                    top = q2.remove();
                    if (q1.isEmpty()) {
                        break;
                    }
                    q1.add(top);

                }

            }

            return top;

        }

        public static int peek(){
            if (isEmpty()) {
                System.out.println("stack is empty");
                return -1;
            }
            int top = -1;
            if (!q1.isEmpty()) {
                while (!q1.isEmpty()) {
                    top = q1.remove();
                    q2.add(top);

                }
            } else {

                while (!q2.isEmpty()) {
                    top = q2.remove();
                    q1.add(top);

                }

            }

            return top;

        }
        }


    

    public static void main(String[] args) {

        // Queue q = new Queue(); // ArrayDeque
        // q.add(1);
        // q.add(2);
        // q.add(3);

        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);


        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
