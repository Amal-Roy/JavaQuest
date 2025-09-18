import java.util.Scanner;
class employee{
    String name;
    String adress;
    int age;
    int mob;
    float sal;
    employee(String name,String adress,int age,int mob,float sal){
        this.name=name;
        this.adress=adress;
        this.age=age;
        this.mob=mob;
        this.sal=sal;

    }
    void print_Salary(){
        
 System.out.println("Name: "+name);
        System.out.println("Address: "+adress);
        System.out.println("age: "+age);
        System.out.println("Mobile: "+mob);
        System.out.println("Salary: "+sal);   
     }
    class officer extends employee{
       String spl;
       officer(String name,String adress,int age,int mob,float sal,String spl){
        super(name,adress,age,mob,sal);
         this.spl=spl;
       }
        void print_specialization(){
            System.out.println("  Specialization " +spl);
    }
        
    }
    class manager extends officer{
        String Dep;
        manager(String name,String adress,int age,int mob,float sal,String spl,String  Dep){
            super(name,adress,age,mob,sal,spl);

            this.Dep=Dep;


        }

         void print_Dept(){
        System.out.println("Enter Department "+Dep);
    }
}
}
public class ManagementSystem {
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
       
        String name;
        String adress,spl,Dep;
        int age;
        int mob;
        float sal;
        
      System.out.println("Enter  Officer's name:");
name=sc.nextLine();
System.out.println("Enter address:");
adress=sc.nextLine();

System.out.println("Enter  age:");
age=sc.nextInt();
sc.nextLine();
System.out.println("Enter  mobile:");
mob=sc.nextInt();
System.out.println("Enter salary:");
sal=sc.nextFloat();
sc.nextLine();
System.out.println("Enter Specialization:");
spl=sc.nextLine();

        
    employee ob=new employee(name, adress, age, mob, sal);
    officer of=new officer (name, adress, age, mob, sal,spl);

        System.out.println("Enter Manager's name:");
        name=sc.nextLine();
        System.out.println("Enter Adress:");
        adress=sc.nextLine();
       
        System.out.println("Enter Age:");
        age= sc.nextInt();
         sc.nextLine();
        System.out.println("Enter Mobile no:");
        mob=sc.nextInt();
        System.out.println("Enter the salary:");
        sal=sc.nextFloat();
         System.out.println("Enter Specialization:");
        spl=sc.nextLine();

        System.out.println("Enter Department:");
        Dep=sc.nextLine();

        manager mr=new manager(name, adress, age, mob, sal,spl,Dep);

        System.out.println("---Officer Details---");
        of.print_Salary();
        of.print_specialization();
        System.out.println("---Manager Details---");
        mr.print_Salary();
        mr.print_specialization();
        mr.print_Dept();
     }
}
    


