import java.util.Scanner;
public class SumOfDigits {
    
public static void main(String[] args){
Scanner sc= new Scanner(System.in);
int  number,sumDigit=0,remainNum,extractNum,sameNum;
System.out.println("Enter a 4 digit number :" );
number=sc.nextInt();
sameNum=number;
while(number!=0)
{
    extractNum=number%10;
    sumDigit=sumDigit+ extractNum;
    number=number/10;
}
System.out.println("The sum of digits in " +sameNum+ " is " +sumDigit);

   }
}
/* 
*Author:Amal Roy
*date: 17-07-2025
*/