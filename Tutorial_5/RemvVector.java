
import java.util.Vector;

public class RemvVector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> v=new Vector<>();
		v.add("Red");
		v.add("Green");
		v.add("Blue");
		v.add("Yellow");
		String element =v.remove(1);
		System.out.println("The final contents in the vector is:\n"+v);

	}

}