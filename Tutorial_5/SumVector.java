
import java.util.Vector;

public class SumVector {
	public static void main(String[] args) {
		int sum=0;
		Vector<Integer>Numbers=new Vector<>();
		Numbers.add(0,10);
		Numbers.add(1,20);
		Numbers.add(2,30);
		Numbers.add(3,40);
		Numbers.add(4,50);
		for(int num:Numbers) {
			sum=sum+num;
		}
		System.out.println("TheSum of numbers in the vector is:\n"+sum);
		

}
}
/*
 * Author:Amal Roy
 * Date:19-07-2025
 */
