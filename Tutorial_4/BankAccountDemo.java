import java.util.Scanner;
class BankAccount{
    long accountNumber;
    String accountHolder;
    int  balance;
    int DepositAmount;
BankAccount( long an,String ah,int bal,int depAm){
     accountNumber=an;
     accountHolder=ah;
     balance=bal;
     DepositAmount=depAm;

}
 
    long deposit(int depAm) { 
        balance = balance + DepositAmount; 
        return balance; 
    } 
 
    void displayDetails() { 
        System.out.println("The Acccount Number:" + accountNumber); 
        System.out.println("The Acccount Holder:" + accountHolder); 
        System.out.println("The Balance :" + balance); 
 
    }
}
public class BankAccountDemo {
         public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
           System.out.println("Enter the Account Number:"); 
        long an = sc.nextLong(); 
        sc.nextLine(); 
        System.out.println("Enter the  name of account holder:"); 
        String ah= sc.nextLine(); 
 
        System.out.println("Enter the balance:"); 
        int bal = sc.nextInt(); 
        System.out.println("Enter the deposit amount:"); 
        int depAm= sc.nextInt(); 
        System.out.println(); 
        BankAccount ob = new BankAccount(an, ah, bal, depAm); 
        ob.deposit(depAm); 
        ob.displayDetails();
    
}
}
/* 
*Author:Amal Roy
*date: 17-07-2025
*/
