import java.util.*;

public class palindrome {
    public static void main(String args[]){
        int n,temp,rem;
        int rev=0;
        Scanner obj=new Scanner(System.in);
        n=obj.nextInt();
        temp=n;

        while(n>0){
            rem=rem%10;
            rev=rev*10+rem;
            n=n/10;
        }
        if(rev==temp)
            System.out.println("PALINDROME");
        else 
            System.out.println("NOT A PALINDROME");     
    }
}
