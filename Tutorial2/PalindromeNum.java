import java.util.Scanner;
public class PalindromeNum {
 public static void main(String[] args){
 Scanner sc=new Scanner(System.in);
 int i,Originalnumber,reverse=0,remain,number;
 System.out.println("Enter a number:");
 Originalnumber=sc.nextInt();
 number=Originalnumber;


 while(number!=0)
 {
    remain=number%10;
    reverse=reverse*10+remain;
    number=number/10;
 }
 if(reverse==Originalnumber){
    System.out.println( Originalnumber+ " is a palindrome number.");
 }
 else{
    System.out.println(Originalnumber+  "  is  not a palindrome number.");
 }

    }
  }
  
/*
 * Author: Amal Roy
 * Date:19-07-2025
 */
