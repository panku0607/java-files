package OOPs;

public class Keyword {
    public static void main(String[] args) {
            // Student s1 = new Student();
            // s1.schoolName = "M.K Mehta";

            // Student s2 = new Student();
           

            // Student s3 = new Student();
            // s3.schoolName = "MBBI " ;
            //  System.out.println(s2.schoolName);


            Complex c = new Complex(4, 0);
            Complex d = new Complex(8, 4) ;

            Complex e = Complex.add(c, d);
            e.printComplex();
            Complex f = Complex.diff(c  ,d );
            f.printComplex();
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






class Complex {
int real ;
int img;

public Complex(int r , int i){
    real = r; 
    img = i ;
}
   public static Complex add(Complex a , Complex b) {
    return new Complex ((a.real + b.real) , (a.img + b.img));
   } 
   
   public static Complex diff(Complex a , Complex b) {
    return new Complex ((a.real - b.real) , (a.img - b.img));
   } 

   public void printComplex(){
    if (real == 0 && img != 0) {
        System.out.println(img + "i");
    }
    else if (img == 0 && real != 0){
        System.out.println(real);
    }
    else{
        System.out.println(real + " " + img);
    }
   }
}