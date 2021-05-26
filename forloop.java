//For loop 
//for(Initialization;condition;process)


public class forloop {

    public static void main(String args[]){

        
        for(int i=0 ,j=1  ;i<=10;  i++,j=j*2)//updation is optional and if you remove condition it will give infinte value
        //we can decalre multiple variable but thier datatype should be same and same for updation 
        {
            System.out.println(i+" "+j);
        }
    }
    
}
