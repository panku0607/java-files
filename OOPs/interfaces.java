package OOPs;

public class interfaces {
        public static void main(String[] args) {
            // Queen q = new Queen();
            // q.moves();


                // Static Keyword 
            Student s1 = new Student();
            s1.Schoolname = "JVM";

            Student s2 = new Student();
            

            Student s3 = new Student();
            s3.Schoolname = "1176";
            System.out.println(s2.Schoolname);
            System.out.println(s1.Schoolname);
            

        }

}

    // interface ChessPlayer{
    //     void moves();
    // }
    // class Queen implements ChessPlayer{
    //     public void moves(){
    //         System.out.println("Up ,Down , left , right , diagobnal dirns");
    //     }
    // }
    // class Rook implements ChessPlayer{
    //     public void moves(){
    //         System.out.println("Up ,Down , left , right");
    //     }
    // }
    // class King implements ChessPlayer{
    //     public void moves(){
    //         System.out.println("Up ,Down , left , right , diagobnal (by 1 step )");
    //     }
    // }

    class Student{
        String name;
        int roll;

        static String Schoolname;
        void setName(String name){
            this.name = name;
        }

        void getName(){
           return this.name ;
        }
    }

