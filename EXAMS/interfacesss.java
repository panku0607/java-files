package EXAMS;
interface drawable{
    void draw();
}
class rectangle implements drawable{
    public void draw() {
        System.out.println("draw rectangle");
    }
    }
    class circle implements drawable{
        public void draw() {
            System.out.println("draw circle");
    
        }
}
public class interfacesss {
    public static void main(String[] args) {
        drawable d = new circle();
        drawable u = new rectangle();
        d . draw();
        u.draw();
    }

   
}
