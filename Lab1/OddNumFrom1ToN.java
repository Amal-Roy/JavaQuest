import java.util.Scanner;
public class OddNumFrom1ToN {
public static void main(String[] args){
Scanner sc= new Scanner(System.in);
int n,i;
System.out.println("Enter a number :" );
n=sc.nextInt();
System.out.println("Odd number from  1 to " +n+ " is ");
for(i=1;i<=n;i++)
{
    if(i%2==0)
    {
        continue;
    }
    System.out.println(+i);
}

}
}
/* 
*Author:Amal Roy
*date: 17-07-2025
*/