import java.util.Scanner;

public class factorial {
    public static void main(String args[]){
        int n,i,fact=1;
        Scanner obj=new Scanner(System.in);
        System.out.println("ENTER A NUMBER : ");
        n=obj.nextInt();
        for(i=1;i<=n;++i)
            fact=fact*i;

        System.out.println("FACTORIAL : "+fact);    
    }
}
