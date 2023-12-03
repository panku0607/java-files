package OOPs;

public class Keyword {
    public static void main(String[] args) {
            Student s1 = new Student();
            s1.schoolName = "M.K Mehta";

            Student s2 = new Student();
           

            Student s3 = new Student();
            s3.schoolName = "MBBI " ;
             System.out.println(s2.schoolName);
    }
}

class Student {

    static int returnPercentage(int maths , int phy , int chem){
        return (maths, phy, chem)/3  ;
    }
    String name;
    int roll;

    static String schoolName;

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }
}
