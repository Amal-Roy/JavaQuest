import java.util.Scanner;
public class reverseOfNumber {
    public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    int i,Originalnumber,reverse=0,remain,number;
    System.out.println("Enter the number:");
    Originalnumber=sc.nextInt();
    number=Originalnumber;

 
    for(i=0;i<number;i++)
    {
       remain=number%10;
       reverse=reverse*10+remain;
       number=number/10;
     }
     System.out.println( " The reversed number of "  + Originalnumber +  "  is  " +reverse);
    }
}
/*
 * Author: Amal Roy
 * Date:19-07-2025
 */

