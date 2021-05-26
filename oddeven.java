// Program to check number is odd or even//

import java.util.*;
public class oddeven {
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);

        

        System.out.println("Enter the number: ");
        int a=sc.nextInt();
        
        if(a%2==0){
            System.out.println("It is a even number");

        }
        else {
            System.out.println("It is a odd number");
        }
        sc.close();
    }
    
}
