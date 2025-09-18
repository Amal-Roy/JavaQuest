
import java.util.Scanner;
import java.util.Arrays;
class Student{
	 String Name;
	 long RegisterNumber;
	 String Course;
	 int Mark1,Mark2,Mark3,Mark4,Mark5,Mark6;
	 float TotalMarks;
	 int Rank;
Student(String Name,long RegisterNumber,String Course, int Mark1,int Mark2,int Mark3,int Mark4,int Mark5,int Mark6,float TotalMarks,int Rank){
	 this.Name=Name;
	 this.RegisterNumber=RegisterNumber;
	 this.Course=Course;
	 this.Mark1=Mark1;
	 this.Mark2=Mark2;
	 this.Mark3=Mark3;
	 this.Mark4=Mark4;
	 this.Mark5=Mark5;
	 this.Mark6=Mark6;
	 this.TotalMarks=TotalMarks;
	 this.Rank=Rank;
}
	
 }
public class StudentDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N,Mark1,Mark2,Mark3,Mark4,Mark5,Mark6,Rank,mark;
		int TotalMarks=0;
		String Name,Course;
		long RegisterNumber;
	;
		int arr[]=new int[6];
		System.out.println("Enter the Number of Students:");
		N=sc.nextInt();
		int Mark[]=new int[100];
		int TotalMark[]=new int[N];
		for (int i = 1; i <= N; i++)
		 {
		System.out.println("Name:");
		Name=sc.nextLine();
		sc.nextLine();
		System.out.println("Register Number:");
		RegisterNumber=sc.nextLong();
		sc.nextLine();
		System.out.println("Course:");
		Course=sc.nextLine();
		sc.nextLine();
         for(int v= 1; v<= 6; v++) {
                System.out.print("Enter marks for subject " + v + ": ");
                mark = sc.nextInt();
                TotalMarks+= mark;
				if(v==5){
				for(int k=0;k<N;k++){
					TotalMark[k]=TotalMarks;
				}
			}
		 }
	}
	Student ob=new Student();
	Arrays.sort(TotalMark);
	System.out.print( "RegNo\t\tName\t\tCourse\t\tTotal\tRank");
	for(int elm:TotalMark){
		System.out.print(+RegisterNumber+ "  "  +Name+  " "  + Course  + " " +elm + " " +Rank);
	}
 }
}

