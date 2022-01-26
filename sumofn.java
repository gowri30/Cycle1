import java.util.Scanner;

public class sumofn {
    public static void main(String args[]){
        int n,i,sum=0;
        Scanner obj=new Scanner(System.in);
        System.out.println("ENTER A NUMBER : ");
        n=obj.nextInt();
        for(i=1;i<=n;++i)
            sum=sum+i;
        System.out.println("SUM IS "+sum);
    }
}
