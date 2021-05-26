//last digit of integer//

import java.util.*;

public class lastdigit {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        int   n,last;

        System.out.println("Enter Number");

        n=sc.nextInt();

        last =n%10;

        System.out.println("Last Digit is : " + last);
        sc.close();

    }
}
