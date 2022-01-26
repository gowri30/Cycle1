import java.util.*;

public class fibonacci {
    public static void main(String args[]){
        int n,f,s,t,i;
        Scanner obj=new Scanner(System.in);
        System.out.println("ENTER A NUMBER : ");
        n=obj.nextInt();
        f=0; s=1;
        System.out.println("FIBONACCI SERIES : ");
        for(i=1;i<=n;++i)
        {
            System.out.println(f);
            t=f+s;
            f=s;
            s=t;
        }
    }
}
