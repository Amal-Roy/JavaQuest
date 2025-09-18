
import java.util.Scanner;
public class studentDetails {

    
    public static void main(String args[]){
        Scanner mk=new Scanner(System.in);
        String name;
        int age;
        long mobileNumber;
        double cgpa;
        float attendencePercentage,attendenceMark;

        System.out.println("Enter  your full name:");
        name=mk.nextLine();
          System.out.println("Enter  your age:");
        age=mk.nextInt();
          System.out.println("Enter  your Mobile Number:");
        mobileNumber=mk.nextLong();
          System.out.println("Enter  your CGPA:");
        cgpa=mk.nextDouble();
          System.out.println("Enter your Attendence percentage:");
        attendencePercentage=mk.nextFloat();
        
        if(attendencePercentage>=90){
          attendenceMark=10;
        }
        else{
        attendenceMark=attendencePercentage/10;
        }

        System.out.println("   My Details  ");
        System.out.println("...................");
        System.out.println("Full Name:       "+name);
        System.out.println("Age:             "+age);
        System.out.println("Mobile Number:   "+mobileNumber);
        System.out.println("CGPA:            "+cgpa);
        System.out.println("Attendence Mark:  "+attendenceMark);
}
}
/* 
author:Amal Roy
Date:18-07-2025
 */
