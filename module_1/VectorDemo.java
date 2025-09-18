import java.util.Vector;
import java.util.Iterator;
import java.util.Scanner;
public class VectorDemo {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        Vector<String> mammals=new Vector<>();
        mammals.add("Dog");
        mammals.add("Horse");
        mammals.add(2,"cat");
        System.out.println(" old Vector" +mammals);
        String elm=mammals.get(2);
        System.out.println("Element at index 2 is:"+elm);
        System.out.println(" new Vector" +mammals);
        mammals.clear();
        System.out.println(" Vector after clear" +mammals);

    
    }
}