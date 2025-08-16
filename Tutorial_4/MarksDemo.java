import java.util.Scanner;
class Marks{
    int  mark1, mark2, mark3;

Marks( int mark1,int  mark2, int mark3){
    this.mark1=mark1;
    this.mark2=mark2;
    this.mark3=mark3;
}
int total(){
   return (mark1+ mark2+ mark3);

}
float average(){
    return  (mark1+ mark2+ mark3)/3; 
}
}
public class MarksDemo {
     public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int mark1,mark2,mark3;
     System.out.println("Enter the mark of subject 1:");
     mark1=sc.nextInt();
     System.out.println("Enter the mark of subject 1:");
     mark2=sc.nextInt();
     System.out.println("Enter the mark of subject 1:");
     mark3=sc.nextInt();
     Marks ob=new Marks(mark1,mark2,mark3);
     System.out.println("Total mark is:" +ob.total());
     System.out.println("Avrerage of marks is :"+ob.average());
    
}
}
/* 
*Author:Amal Roy
*date: 17-07-2025
*/