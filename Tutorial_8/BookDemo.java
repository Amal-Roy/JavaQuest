import java.util.Scanner;
class Book{
     String title;
     String author;
     Book(String title,String author){
        this.title=title;
        this.author=author;
     }
     void display(){
        System.out.println("Title of the book :" +title );
        System.out.println("Author of the book : " +author );     

        }
}
class Technical extends Book{
      String subject;
      Technical(String title,String author,String subject){
      super(title,author);
      this.subject=subject;
      }
      void display(){
        System.out.println("Title of the book :" +title );
        System.out.println("Author of the book :" +author );
        System.out.println("Subject of the book :" +title );
     

        }

    
}
class Story extends Technical{
   String genre;
   Story(String title,String author,String subject,String genre){
      super(title,author,subject);
      this.genre=genre;
   }
      void display(){
        System.out.println("Title of the book: " +title);
        System.out.println("Author of the book: " +author);
        System.out.println("Genre of the book: " +genre );
     

        }
}
public class BookDemo {
   public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      String title,author,subject,genre;
      System.out.println("Book Details\n");
      System.out.println("Enter the title of the Book:");
      title=sc.nextLine();
      System.out.println("Enter the name of author of the Book:");
      author=sc.nextLine();
      Book ob1=new Book(title,author);
      System.out.println("Technical Book Details\n");
      System.out.println("Enter the title of the Book:");
      title=sc.nextLine();
      System.out.println("Author of the Book:");
      author=sc.nextLine();
      sc.nextLine();
      System.out.println("Subject of the book");
      subject=sc.nextLine();
      Technical ob2=new Technical(title,author,subject);
      System.out.println("Story  Book Details\n");
      System.out.println("Enter the title of the Book:");
      title=sc.nextLine();
      System.out.println("Author of the Book:");
      author=sc.nextLine();
      sc.nextLine();
      System.out.println("Genre of the Book:");
      genre=sc.nextLine();
      Story ob3=new Story(title,author,subject,genre);
      System.out.println("---Book---");
      ob1.display();
      System.out.println("--- Technical Book---");
      ob2.display();
      System.out.println("--- Story Book---");
      ob3.display();
   }
}
