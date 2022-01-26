import java.util.*;

public class armstrong {
    public static void main(String args[]){
        int n,temp,rem;
        int sum=0;
        Scanner obj=new Scanner(System.in);
        System.out.println("ENTER A NUMBER : ");
        n=obj.nextInt();
        temp=n;

        while(n>0)
        {
            rem=rem%10;
            sum=sum+rem*rem*rem;
            n=n/10;
        }
        if(sum==temp)
            System.out.println("ITS AN ARMSTRONG NUMBER");
        else 
            System.out.println("NOT AN ARMSTRONG NUMBER");    
    }
}
