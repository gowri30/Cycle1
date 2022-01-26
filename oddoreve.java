import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class oddoreve {
     public static void main(String args[]) {
         int a;
         Scanner obj=new Scanner(System.in);
         System.out.println("ENTER A NUMBER : ");
         a=obj.nextInt();
         if(a%2==0)
          System.out.println(a+" IS AN EVEN NUMBER");
         else 
          System.out.println(a+" IS AN ODD NUMBER");
    }   
}
