
import java.util.Scanner;
class Operation
{
 int number1;
 int number2;

Operation(int n1,int n2)
{
 number1=n1;
 number2=n2;
}
int add()
{
 return number1+number2;
}
int subtract()
{
 return number1-number2;
}
int multiply()
{
 return number1*number2;
}
int divide()
{
 return number1/number2;
}
 
  }

public class MyCalculator {
 public static void main(String[] args) {
  // TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       int n1,n2,num1,num2;
       char ch='Y';
       int i=0;
       while(ch=='Y'){
        if(i!=0){
            System.out.println("Do you want to continue: Y/N");
            ch=sc.next().charAt(0);
        }
        if(ch=='N'){
            System.out.println("Operation ended:");
            break;
        }
       
       System.out.println("--- Calculator Menu ---\n");
       System.out.println(" + 1. Add\n");
       System.out.println(" + 2. Subtract\n");
       System.out.println(" + 3. Multiply\n");
       System.out.println(" + 4. Divide\n");
       System.out.println("+ Enter your choice (1-4):");
       int choice=sc.nextInt();
       System.out.println("Enter two numbers:");
       n1=sc.nextInt();
       n2=sc.nextInt();
       Operation calc=new Operation(n1,n2);
       int result=0;
       switch(choice)
       {
        case 1:
             result=calc.add();
             break;
        case 2:
             result=calc.subtract();
             break;
        case 3:
             result=calc.multiply();
             break;
        case 4:
             result=calc.divide();
             break;
       
       }
       System.out.println("Result:" +result);
       i++;
    }
 }
}
/* 
author:Amal Roy
Date:18-07-2025
 */