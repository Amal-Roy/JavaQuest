import java.util.Vector;
import java.util.Scanner;
public class SearchVector {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String item;
        int count=0;
        Vector<String>Student=new Vector<>();
        Student.add("Pen");
		Student.add("Notebook");
		Student.add("Eraser");
		Student.add("Marker");
        System.out.println("Enter an item name:");
        item=sc.nextLine();
        for(String word:Student){
            if(Student.contains(item)){
                System.out.println("Item is found");
                break;
            }
            else if(count==3){

            System.out.println("Item not  found");
            }
             count++;
            }
        }
        


    }
    /*
 * Author:Amal Roy
 * Date:19-07-2025
 */

