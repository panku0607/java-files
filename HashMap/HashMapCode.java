package HashMap;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.LinkedHashMap;

public class HashMapCode {
    
    static class HashMap<K,V> {   // geberic means (data type can be of any type)

        private class Node {
            K key;
            V value;

            public Node (K key , V value){
                this.key = key;
                this.value = value;
            }
        }

        private int n; // Node size
        private int N; // array size
        private LinkedList<Node> buckets[]; // N = buckets.lenght;

        @SuppressWarnings("unchecked")
        public HashMap(){
            this.N = 4;
            this.buckets = new LinkedList[4];
            for (int i = 0; i < 4; i++) {
                this.buckets[i] = new LinkedList<>();
            }
        }

      



            @SuppressWarnings ("unchecked")
            private void rehash(){
            LinkedList<Node> oldBuck[] = buckets;
            buckets = new LinkedList[N * 2];
            N = 2 * N;
            for(int i = 0; i < buckets.length; i++){
                buckets[i] = new LinkedList<>();
            }



            // node  -> add in bucket 
            for (int i = 0; i< oldBuck.length; i++){
                LinkedList<Node> ll = oldBuck[i];
                for(int j = 0; j < ll.size() ; j++){
                    Node node = ll.remove();
                    put(node.key, node.value);  
                }
            }

        }

        public int hashFunction(K key){
            int hc = key.hashCode();
            return Math.abs(hc)  %  N;
       }

       public int SearchInLL(K key , int bi){
           LinkedList<Node> ll = buckets[bi];
           int di = 0;

           for(int i=0; i<ll.size(); i++){
               Node node = ll.get(i);
               if (node.key == key) {
                   return di;
               }
               di++;
           }
           return -1;
       }
        public void put(K key , V value){
            int bi = hashFunction(  key);  // 0 to 3
            int di = SearchInLL(key , bi ); // Valid or -1 ;
            if (di != -1) {
                Node node = buckets[bi].get(di);
                node.value = value;
            } else{
                buckets[bi].add(new Node(key, value));
                n++;
            }

            double lambda = (double) n / N;
            if (lambda > 2.0) {
                rehash();
            }
        }

        public boolean containsKey(K key){
            int bi = hashFunction(key);  // 0 to 3
            int di = SearchInLL(key , bi ); // Valid or -1 ;
            if (di != -1) {
               return true;
            } else{
                return false;
            }
        }

        public V remove(K key){
            int bi = hashFunction(key);  // 0 to 3
            int di = SearchInLL(key , bi ); // Valid or -1 ;
            if (di != -1) {
                Node node = buckets[bi].remove(di);
                n--;
                return node.value;
            } else{
                return null;
            }
        }

        public V get(K key){
            int bi = hashFunction(key);  // 0 to 3
            int di = SearchInLL(key , bi ); // Valid or -1 ;
            
            if (di != -1) {
                Node node = buckets[bi].get(di);
                return node.value;
            } else{

                return null;
            }
        }

        public ArrayList<K> keySet(){
            ArrayList<K> keys = new ArrayList<>();
            for (int i = 0; i < buckets.length; i++) {
                LinkedList<Node> ll = buckets[i];
                for (Node node : ll) {
                    keys.add((node.key));
                }
            }
            return keys;
        }

        public boolean isEmpty(){
            return n == 0;
        }

    }







    public static void main(String[] args) {
        // HashMap<String , Integer> hm = new HashMap<>();
        // hm.put("Nepal", 10);
        // hm.put("India", 100);
        // hm.put("US", 50);
        // hm.put("China", 140);
        // // hm.remove("US");
    

        // ArrayList<String> keys = hm.keySet();
        // for(String key : keys){
        //     System.out.println(key);
        // }
                
        // System.out.println(hm.containsKey("India"));
        // System.out.println(hm.get("India"));
        // System.out.println(hm.remove("India"));
        // System.out.println(hm.get("India"));


        // System.out.println(hm.keySet());


       
    
        
       
    }
}
