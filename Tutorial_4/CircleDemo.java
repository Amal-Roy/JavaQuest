import java.util.Scanner;
class Circle{
    double radius;

Circle(double rad){
    radius=rad;
}
  void computeAndDisplay(){
    double area= 3.14*radius*radius;
    double circum= 2*(3.14)*radius;
    System.out.println("Area " +area);
    System.out.println("Circumference "+circum);
}
}
 
    
public class CircleDemo {
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        Double rad;
        System.out.println("Enter the radius of the circle:");
        rad=sc.nextDouble();
        Circle ob=new Circle(rad);
        ob.computeAndDisplay();


    }
    
}
