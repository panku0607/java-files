package Classes;

public class Iterative_Mtd {
    public static void main(String[] args) {
        
        int num = 15;
        int flag = 0;
        for(int i = 2 ; i< num ; i++)
        {
            if(num % i == 0){
                flag = 1;//not prime 
            }
        }

        if(flag == 1)
        {
            System.out.println("It is not prime");
        } 
        else{
            System.out.println("It is prime ");
        }
    }
}
