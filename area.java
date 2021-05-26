import java.util.*;

public class area {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        float b,h,area;
        System.out.println("Enter sides:");
        b=sc.nextFloat();
        h=sc.nextFloat();

        area=(float) (b*h/2.0);


        System.out.println("area of Tr:" + area);
        sc.close();
    }
    
}
