import java.io.IOException;
import java.util.Scanner;

public class multiply {

    public static void main(String[] args ) throws IOException{

        Scanner s = new Scanner(System.in);

        int a =s.nextInt();
        int b=s.nextInt();

        int sum=0,multi=0;

        multi=a*b;

        sum=a+b;

        System.out.println("Multiplied Value: " + multi + " & Sum Value: "+sum+ " ");
        s.close();



        
        
    }
    
}
