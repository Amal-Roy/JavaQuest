import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        int i,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements to insert :");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the numbers:");
        for(i=0;i<n;i++){
          arr[i]=sc.nextInt();
        }
       
        System.out.println("Array elements in the same order:");
        for(i=0;i<n;i++){
           System.out.print(arr[i]+ " ," + "  " + " ");

        }
        System.out.println("\n");

        System.out.println("Arrray elements in the reverse order:");

        for(i=n-1;i>=0;i--){
           System.out.print(arr[i]+ " ," + "  " + "");

        }
    }
}
