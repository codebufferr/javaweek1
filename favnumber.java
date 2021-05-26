import java.util.Scanner;

class web {
    public static void main(String[] args) throws Exception {

        Scanner s = new Scanner(System.in);

          int t = s.nextInt();
          while (t-->0){
              int n=s.nextInt();
              int rem,count=0;

              while(n!=0) {
                  rem=n%10;
                  n=n/10;

                  if(rem==5) {
                    count++;
                }
            }
            System.out.println(count);
            
          }
          s.close();
        }
    }
