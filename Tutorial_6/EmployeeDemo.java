class Employee{
    protected int salary;
    Employee(int salary){
        this.salary=salary;
    }
    protected void showSalary(){
        System.out.println(("Salary: "+ salary));
    }

}
class Manager extends Employee{
    
    public void display() {
       super.showSalary();
    }

}

public class EmployeeDemo{
    public static void main(String[] args) {
        int salary=100000;
        Employee new=ob1 Employee(salary);
        ob1.showSalary();
        Manager ob=new Manager();
        ob.display();

    }
}