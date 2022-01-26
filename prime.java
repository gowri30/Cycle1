import java.util.*;

class prime {
    public static void main(String args[]){
        int a,i,flag=0;
        Scanner obj=new Scanner(System.in);
        System.out.println("ENTER A NUMBER : ");
        a=obj.nextInt();
        for(i=2;i<=a/2;++i)
        {
            if(a%i==0)
            {
                flag=1;
                break;
            }
        }
        if(flag==0)
            System.out.println("A PRIME NUMBER ");
        else
            System.out.println("NOT A PRIME NUMBER "); 
    }     
}
