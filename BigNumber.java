import java.util.Scanner;
public class BigNumber {
    


    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int firstNumber,secondNumber,bigNumber;
        System.out.println("Enter the first number:");
        firstNumber=sc.nextInt();
        System.out.println("Enter the second number:");
        secondNumber=sc.nextInt();
        bigNumber=firstNumber>secondNumber?firstNumber:secondNumber;
    
        System.out.println("I am "+" "+bigNumber+","+ "I am Big");


    }


}
