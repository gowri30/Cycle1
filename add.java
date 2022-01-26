import java.util.Scanner;

class add{
    public static void main(String args[]){
        int a,b,sum=0;
        Scanner obj=new Scanner(System.in);
        System.out.println("ENTER TWO NUMBERS : ");
        a=obj.nextInt();
        b=obj.nextInt();
        sum=a+b;
        System.out.println("SUM OF THE TWO NUMBERS : "+sum);
    }
}