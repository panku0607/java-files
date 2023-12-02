package EXAMS;
import java.util.*;
public class LIST {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Pankaj");
        list.add("Monika");
        list.add("Pallavi");
        list.add("Nirmal");
        Iterator itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
