import java.util.*;
class Students{
     String name,course;
     int rollNo;
     Students(String name,String course,int rollNo){
        this.name=name;
        this.course=course;
        this.rollNo=rollNo;
     }
     void setDisplay1(){
        System.out.println("Name: " +name);
        System.out.println("Roll No: " +rollNo);
        System.out.println("Course: " +course);
     }
    }  

class StudentAccount extends Students{
      float collegeFee;
      StudentAccount(String name,String course,int rollNo,float collegeFee){
        super(name,course,rollNo);
        this.collegeFee=collegeFee;
      }
      void setDisplay2(){
      System.out.println("College Fee: "+collegeFee);

     }
}

class Hosteller extends StudentAccount{
      float  hostelFee;
      float messFee;
      float totalFee1;
      Hosteller(String name,String course,int rollNo,float collegeFee, float hostelFee,float messFee,float totalFee1){
         super(name,course,rollNo,collegeFee);
           this.hostelFee=hostelFee;
           this.messFee=messFee;
           this.totalFee1=totalFee1;
      }
      void setDisplay3(){
      System.out.println("Hostel Fee: " +hostelFee);
      System.out.println("Mess fee: " +messFee);
      System.err.println("Total Fee: "+totalFee1);
       
      }  
}
class Dayscholar extends Hosteller{
      float busFee;
      float totalFee2;
      Dayscholar(String name,String course,int rollNo,float collegeFee, float hostelFee,float messFee ,float totalFee1,float busFee,float totalFee2){
        super(name,course,rollNo,collegeFee,hostelFee,messFee,totalFee1);
        this.busFee=busFee;
        this.totalFee2=totalFee2;
      }
      void setDisplay4(){
      System.out.println("Bus Fee: "+busFee);
      System.out.println("Total Fee: "+totalFee2);

     }
}

public class StudentManagementSystem{ 
 public static void main(String[] args) {
    Scanner sc=new Scanner (System.in);
    String name,course;
    int rollNo;
    float collegeFee, hostelFee, messFee, totalFee1, busFee, totalFee2;
    System.out.println("Enter Hosteller's name:");
    name=sc.nextLine();
   
    System.out.println("Enter Roll No:");
    rollNo=sc.nextInt();
    sc.nextLine();
    System.out.println("Enter Course:");
    course=sc.nextLine();
    sc.nextLine();
    System.out.println("Enter College Fee:");
    collegeFee=sc.nextFloat();
    System.out.println("Enter Hostel Fee:");
    hostelFee=sc.nextFloat();

    System.out.println("Enter Mess Fee:");
    messFee=sc.nextFloat();
    totalFee1=collegeFee+hostelFee+messFee;
    Students ob1=new Students(name,course,rollNo);
    StudentAccount ob2=new StudentAccount(name,course,rollNo,collegeFee);
    Hosteller ob3=new Hosteller(name,course,rollNo,collegeFee,hostelFee,messFee,totalFee1);
    
    sc.nextLine();
    System.out.println("Enter DayScholar's name:");
    name=sc.nextLine();

    System.out.println("Enter Roll No:");
    rollNo=sc.nextInt();
    sc.nextLine();
    System.out.println("Enter Course:");
    course=sc.nextLine();
    sc.nextLine();
    System.out.println("Enter College Fee:");
    collegeFee=sc.nextFloat();
    System.out.println("Enter Bus Fee:");
    busFee=sc.nextFloat();
    totalFee2=collegeFee+busFee;
    Dayscholar ob4=new Dayscholar(name,course,rollNo,collegeFee,hostelFee,messFee,totalFee1,busFee,totalFee2);


System.out.println("---Hosteler's---");
ob1.setDisplay1();
ob2.setDisplay2();
ob3.setDisplay3();


System.out.println("---Dayscholar's Details---");
ob4.setDisplay1();
ob4.setDisplay2();
ob4.setDisplay4();

}

}

