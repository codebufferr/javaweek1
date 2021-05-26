//Radix of a number given in a string //

import java.util.*;

public class radixofNum {

    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter number: ");

        String num=sc.nextLine();

        if(num.matches("[01]+")){
            System.out.println("Number is binary and Radix 2");
        }
        else if(num.matches("[0-7]+")){
            System.out.println("Number is octal and Radix 8");

        }
        else if(num.matches("[0-9]+")){
            System.out.println("Number is Decimal and Radix 10");
        }
        else if(num.matches("[0-9A-F]+"))
        {
            System.out.println("Number is Hexidecimal and Radix 16");
        }else{
            System.out.println("Invalid Number");
        }
        sc.close();
    }
    
}
