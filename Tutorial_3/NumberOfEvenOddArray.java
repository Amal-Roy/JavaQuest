import java.util.Scanner;
public class NumberOfEvenOddArray {
     public static void main(String[] args) {
        int i,n,oddcount=0,evencount=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of integers in your array:");
        n=sc.nextInt();
        int arr[]=new int[n];
         System.out.println("Enter the " +n+ " elements in your array:");
        for(i=0;i<n;i++){
          arr[i]=sc.nextInt();
        }
         for(i=0;i<n;i++){
          if(arr[i] % 2==0){
            evencount++;
          }
          else{
            oddcount++;
          }
        }
        System.out.println("The number of even numbers in the array is " +evencount);
        System.out.println("The number of odd numbers in the array is " +oddcount);

  }
 }
