
import java.util.Scanner;
public class Fibonacci {
public static void main(String[] args){
Scanner sc= new Scanner(System.in);
int limit,a=0,b=1;
System.out.println("Enter a number:");
limit=sc.nextInt();
System.out.println("Fibonacci series up to  " +limit+ " is");

System.out.print(+a+" " + b + " ");
int c=a+b;
while(limit!=0 && c<=limit)
{
    System.out.print(c + " ");
    a=b;
    b=c;
    c=a+b;
}

  }
}
/*
*Author:Amal Roy
*Date : 19-07-2025
*/