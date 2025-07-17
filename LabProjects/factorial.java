import java.util.Scanner;
public class factorial{
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int i,fact=1,number;
    System.out.println("Enter the number" );
    number=sc.nextInt();
   
    for(i=1;i<=number;i++)
    {
        fact=fact*i;
    }
    System.out.println("The factorial of"  +number+  "is" +fact );
}
}
/* 
*Author:Amal Roy
*date: 17-07-2025
*/