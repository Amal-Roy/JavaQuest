import java.util.Vector;

public class MaxVector {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int max=0;
		Vector<Integer>Numbers=new Vector<>();
		Numbers.add(0,25);
		Numbers.add(1,60);
		Numbers.add(2,15);
		Numbers.add(3,80);
		Numbers.add(4,45);
		for(int num:Numbers) {
			if(num>max) {
				max=num;
			}
		}
		System.out.println("The greatest number in  in the vector is:\n"+max);

	}

}
/*
 * Author:Amal Roy
 * Date:19-07-2025
 */