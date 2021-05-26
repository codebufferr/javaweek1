import java.util.*;

public class radix{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        float r,area ;
        System.out.println("Enter radius:");
        r=s.nextFloat();

        area=(float) (3.14*r*r);
        System.out.println("area if circle:"+area );
        s.close();
      

    }
}