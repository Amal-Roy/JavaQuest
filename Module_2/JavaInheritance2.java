
class Parent{
    int ab=80;
    void print(){
        System.out.println("Parent class="+ab);

    }
}
class child extends Parent{
    void print(){
        System.out.println("Child class="+ab);
        super.print();

    }
}


public class JavaInheritance2 {
    public static void main(String[] args) {
        child s=new child();
        s.print();

    }
}
