import java.util.Scanner;
class Book{
    String title, author;
    Double price;

Book(String author,String title,Double price){
    this.author=author;
    this.title=title;
    this.price=price;
}
void display(){
    
    System.out.println("Author : " +author);
    System.out.println("Title : " +title);
    System.out.println("Price : " +price);
}

}
public class BookDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String author,title;
        Double price;
        System.out.println("----Book 1-----");
        System.out.println("Enter the name of Author ,title and its price of book 1: ");
        author=sc.nextLine();   
        title=sc.nextLine();  
        price=sc.nextDouble(); 
        Book ob1=new Book(author,title,price);
        
        System.out.println("----Book 2-----");
        System.out.println("Enter the name of Author ,title  and its price of book 2 : ");
        String author2=sc.nextLine();   
        String title2=sc.nextLine();
        sc.nextLine(); 
        double price2=sc.nextDouble();

        Book ob2=new Book(author2,title2,price2);
        System.out.println("----Book 1-----");
        ob1.display();
        System.out.println("\n");
        System.out.println("----Book 1-----");
        ob2.display();
    }   
} 
/* 
*Author:Amal Roy
*date: 17-07-2025
*/

