//Condition statement , Nested Statement(Condion inside conditon ) //

//Biggest number amoung 3 numbers // 

import java.util.*;

public class conditionalstat {

    public static void main(String args[]){

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the numbers : ");
        
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        

        if(a>b && a>c){
            System.out.println(a);

        }
        else if(b>c){
            System.out.println(b);
        }
        else{
            System.out.println(c);
        }
        sc.close();
    }
    
}
