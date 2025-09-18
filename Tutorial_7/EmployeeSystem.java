import java.util.*;

class employee{
    String name,address;
    int age,mob;
    float sal;

    employee(String name,String address,int age,int mob,float sal){
        this.name=name;
        this.address=address;
        this.age=age;
        this.mob=mob;
        this.sal=sal;
    }

    void print_Salary(){
        System.out.println("Name: "+name);
        System.out.println("Address: "+address);
        System.out.println("age: "+age);
        System.out.println("Mobile: "+mob);
        System.out.println("Salary: "+sal);
    }


}

class officer extends employee{
     String spl;
     officer(String name,String address,int age,int mob,float sal,String spl){
        super(name,address,age,mob,sal);
        this.spl=spl;
     }

     void print_specialization(){
        //  System.out.println("Name: "+name);
        // System.out.println("Address: "+address);
        // System.out.println("age: "+age);
        // System.out.println("Salary: "+sal);
        System.out.println("Specialization: "+spl);
     }

}

class manager extends officer{

    String dep;
    
    manager(String name,String address,int age,int mob,float sal,String spl,String dep){
          super(name,address,age,mob,sal,spl);
        this.dep=dep;
    }
    void print_Dept(){
        System.out.println("Department: "+dep);
    }
}

public class EmployeeSystem {
        public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String name,address,spl,dep;
    int age,mob;
    float sal;
System.out.println("Enter the Officer's name:");
name=sc.nextLine();
System.out.println("Enter the address:");
address=sc.nextLine();

System.out.println("Enter the age:");
age=sc.nextInt();
sc.nextLine();
System.out.println("Enter the mobile:");
mob=sc.nextInt();
System.out.println("Enter the salary:");
sal=sc.nextFloat();
sc.nextLine();
System.out.println("Enter the Specialization:");
spl=sc.nextLine();
// System.out.println("Enter the Specialization:");
// spl=sc.nextLine();

    employee e1=new employee(name, address, age, mob, sal);
    officer o1=new officer (name, address, age, mob, sal,spl);

    System.out.println("Enter the Manager's name:");
name=sc.nextLine();
System.out.println("Enter the address:");
address=sc.nextLine();

System.out.println("Enter the age:");
age=sc.nextInt();
sc.nextLine();
System.out.println("Enter the mobile:");
mob=sc.nextInt();
sc.nextLine();
System.out.println("Enter the salary:");
sal=sc.nextFloat();
sc.nextLine();
System.out.println("Enter the Specialization:");
spl=sc.nextLine();    

System.out.println("Enter the Department:");
dep=sc.nextLine();
System.out.println("\n");
    manager m1=new manager(name, address, age, mob, sal,spl,dep);
    System.out.println("---Officer Details---");
    o1.print_Salary();
    o1.print_specialization();
System.out.println("\n");
    System.out.println("---Manager Details---");
    m1.print_Salary();
    m1.print_specialization();
    m1.print_Dept();
    
    

}
    
} 
 