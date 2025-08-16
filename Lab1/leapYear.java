import java.util.Scanner;
public class leapYear {
public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
int year;
System.out.println("Enter the Year:");
year=sc.nextInt();
if((year%4==0 && year%100!=0) || year%400==0)
{
    System.out.println(+ year +  " is a leap year");
}


else
{
    System.out.println(+ year + " is not a leap year");
}

  }
}
/* 
*Author:Amal Roy
*date: 17-07-2025
*/