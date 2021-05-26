public class bitwise{
    public static void main(String arg[]){
        int x=0b1010;
        int y=0b0111;
        int z,k,a;

        k=x|y; //OR
        a=x^y;//XOR

        z=x&y;//AND 

        System.out.println(z+" "+k+" "+a);
    }
}