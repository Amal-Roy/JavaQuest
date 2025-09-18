import java.util.Scanner;
public class Gradecard {
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int mark;
        String subject;
        char grade;
        String name;

        System.out.println("Enter the name of subject:");
        subject=sc.nextLine();
        
        System.out.println("Enter your name:");
        name=sc.nextLine();
        
        System.out.println("Enter the Score:");
        mark=sc.nextInt();

        if(mark>=90){
            grade='S';
        }

        else if(mark>=80 && mark<90){
            grade='A';
        }

         else if(mark>=70 && mark<80){
            grade='B';
        }

        else if(mark>=60 && mark<70){
            grade='C';
        }

        else if(mark>=50 && mark<60){
            grade='D';
        }

        else{
            grade='F';
        }

        System.out.println("Grade of "  +name+   "who scored"     +mark+   " marks in"  +subject+  "is"    +grade);
        
    }
}

/* 
author:Amal Roy
Date:18-07-2025
 */

