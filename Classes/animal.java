package Classes;

class bird{ // method overriding

    String name = "Parrot";
    String Address = " India";

    void show(){
        System.out.println(" JAY SHREE RAM");
    }
}

     class insect extends bird
    {

        String name1 = "butterfly";
        String work = "Birds feed on insects";
        void show(){
            System.out.println("JAY BAJRANG BALI");
        }
    }

public class animal{
    public static void main(String args[]){
       insect obj = new insect();
       System.out.println(obj.work);
       obj.show();
       System.out.print(obj.name);
    }
}