import java.util.Scanner;
public class ArrayMaxMinm{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,i,max=0,min=0;
        System.out.println("Enter the limit of your array:");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of your array:");
        for(i=0;i<n;i++){
          arr[i]=sc.nextInt();
        }
    
        for(i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }

        }
        for(i=0;i<n;i++){
            if(arr[i]<min){
                min=arr[i];
            }

        }
         System.out.println("Maximum value is " +max+ " and Minimum value is " + min);

    }
}