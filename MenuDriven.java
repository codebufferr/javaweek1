//Menu Driven program to calculate Arthimetic Operation //

import java.util.*;

public class MenuDriven {

    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);

        System.out.println("Menu ==== ADD,SUBS,MULT,DIVID");
        System.out.println("  ");
        System.out.println("Enter 2 number; ");

        int a=sc.nextInt();
        int b=sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Option in words(ADD,SUBS,MULT,DIVID) : ");
        
        String option=sc.nextLine();
      
            option=option.toUpperCase();
        switch (option) {
            case "ADD":System.out.println("Sum is: "+(a+b));
                        break;
            case "SUBS":System.out.println("Substraction is: " +(a-b));
                        break;
            case "MULT":System.out.println("Multiplication is: " +(a*b));
                        break;
            case "DIVI":System.out.println("Division is: "+(a/b));
                        break;
                
        
            default:System.out.println("Invalid Operation");
                break;
        }
        sc.close();
    }
    
}
