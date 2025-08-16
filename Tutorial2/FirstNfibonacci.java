import java.util.Scanner;
public class FirstNfibonacci {
public static void main(String[] args){
Scanner sc= new Scanner(System.in);
int n,c=1,a=0,b=1,i,e=0,f=1;
System.out.println("Enter a number:");
n=sc.nextInt();
System.out.println( "First " +n+ "Fibonacci series is");


    if(n==1){
        System.out.print(+a);
        return;
    }
    else if(n==2){
        System.out.print(+a+ " ");
        System.out.print(+b);
        return;
    }
   
    else{
        
    System.out.print(+a+ " " );
    System.out.print(+b+ " " );
    }
    for(i=0;i<n-2;i++)
    {
    c=a+b;
    System.out.print(+c+ " ");
    a=b; 
    b=c;
    } 

  }
}
/*
 * Author: Amal Roy
 * Date:19-07-2025
 */

