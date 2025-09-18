import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any string: "); 

        String content = sc.nextLine();

        char[] arr = content.toCharArray();

        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        String reversed = new String(arr);

        System.out.println("The reversed string is: " + reversed);
        sc.close();
    }
}
