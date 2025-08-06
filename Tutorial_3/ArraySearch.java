import java.util.*;
public class ArraySearch {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int n,i,num;
System.out.println("Enter the number of elements in your array :");
n=sc.nextInt();
int arr[]=new int[n]; 
 System.out.println("Enter the " +n+ " elements in your array:");      
 for(i=0;i<n;i++){
   arr[i]=sc.nextInt();
}
System.out.println("Enter  the number for searching:");
num=sc.nextInt();
for(i=0;i<n;i++){
    if(num==arr[i]){
        System.out.println("The number " +num+ " is in the position "  +(i+1));
        break;
    }

}
    if(i==n){
         System.out.println("The number " +num+ "is not belongs to this array");
    }
   


}
}
