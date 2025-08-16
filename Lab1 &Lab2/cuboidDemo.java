import java.util.Scanner;
 class Cuboid {
    double length;
    double breadth;
    double height;

 
void setDimension(double l,double b,double h)
{
length=l;
breadth=b;
height=h;
}
double calculateVolume(){
    double volume=breadth*height*length;
    return volume;  
}
double calculateSurfacearea(){
 
    return 2*(length*breadth+height*breadth+length*height);

}
 }
public class cuboidDemo{
    public static void main(String[] args)
    {
        System.out.println("Please enter the heiht,breadth,and length of the cuboid:");
        Scanner sc=new Scanner(System.in);
        double length=sc.nextDouble();
        double breadth=sc.nextDouble();
        double height=sc.nextDouble();
        Cuboid mybox=new Cuboid();

        mybox.setDimension(length,breadth,height);

        double volume=mybox.calculateVolume();
        System.out.println("Volume of the cube with dimensions:"+length+"*"+breadth+" * "+height+" is :" +volume);

        double Surfacearea=mybox.calculateSurfacearea();
        System.out.println("Surface area of the box is : " +Surfacearea);

}
}
