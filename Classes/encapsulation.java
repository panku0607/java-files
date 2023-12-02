package Classes;
 class person{
    private String name;
    public String getName(){        // getter method
        return name;
    }
    public String setName(String newname){ //setter method
        this.name = newname;  // this keyword represents the current objects;
        return newname;
    } 
}

public class encapsulation {
    public static void main(String[] args) {
        person obj = new person();
        obj.setName("Pankaj Thakur ");
        System.out.println(obj.getName());
    }
}
