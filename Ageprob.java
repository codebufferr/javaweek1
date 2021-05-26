// Program to check given age is young or not //
import java.util.*;
public class Ageprob {
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter age: " );

        int age=sc.nextInt();

        if(age>=14 && age<=30){

            System.out.println("You are young.");
        }
        else if(age<=14){
            System.out.println("You are Children");
        }
        else {
            System.out.println("You are old ");
        }
        
        sc.close();

    }
    
}
