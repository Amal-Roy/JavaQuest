import java.util.Scanner;
public class primeNumber {
 public static void main(String[] args){
Scanner sc= new Scanner(System.in);
int number,i,count=0;
System.out.println("Enter the number:");
number=sc.nextInt();
for(i=2;i<=number/2;i++)
{
    if(number%i==0){
        count++;
    }
}
if(count==0 && number>1){
    System.out.println(number+ " is a prime number ");
}
else{
    System.out.println(number+ " is not  a prime number ");
}
  
  }
}
/*
 * Author: Amal Roy
 * Date:19-07-2025
 */
