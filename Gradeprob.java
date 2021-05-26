//Program to find grade of students in 3 subjects//
import java.util.*;

public class Gradeprob {
    public static void main(String args[]){
    

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the marks;");

        int m1=sc.nextInt();
        int m2=sc.nextInt();
        int m3=sc.nextInt();

        int total=m1+m2+m3;

        System.out.println("Total marks: "+ total);

        int average=(m1+m2+m3)/3;

        System.out.println("Average marks in 3 subjects: "+ average);
        
        if(average>=70){
            System.out.println("Grade - A ");
        }
        else if(average>=60 && average<=70){
            System.out.println("Grade - B ");

        }
        else if(average>=50 && average<=60)
        {
            System.out.println("Grade- C");

        }
        else if(average>=40 && average<=50){
            System.out.println("Grade - D");

        }else {
            System.out.println("Fail");
        }
        sc.close();
    }
        
    
}
