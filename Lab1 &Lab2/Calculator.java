import java.util.Scanner;
public class Calculator {
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int number1,number2;
char operator;
System.out.println("Enter two numbers for performing mathematical operation");
number1=sc.nextInt();
number2=sc.nextInt();
System.out.println("Enter your operator*(+,-,*,/)");
operator=sc.next().charAt(0);
switch(operator){
case'+':
System.out.println(+(number1+number2));
break;
case'-':
System.out.println(+(number1-number2));
break;
case'*':
System.out.println(+(number1*number2));
break;
case'/':
if(number2!=0){
    
    System.out.println(+(number1/number2));
    break; 
}
else{
    System.out.println("Division is not possible");
}
break;
default:

System.out.println("Invalid operator");
}

    }
}
/*
 * Author:Amal Roy
 * Date:19-07-2025
 */
