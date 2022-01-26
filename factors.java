import java.util.Scanner;

public class factors {
    public static void main(String args[]){
        int n,i,fact=1;
        Scanner obj=new Scanner(System.in);
        System.out.println("ENTER A NUMBER : ");
        n=obj.nextInt();
        System.out.println("FACTORS : ");
        for(i=1;i<n;++i){
            if(n%i==0)
                System.out.println(+i);
        }
    }
}
