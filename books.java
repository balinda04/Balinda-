package assignement;
import java.util.Scanner;
public class Q7 {
   static String bookTitle;
  static  String author;
  static  String pName;
static int maxNbrOfBook=3;
    public Q7(String bookTitle, String author, String pName) {
        this.bookTitle = bookTitle;
        this.author = author;
        this.pName = pName;
    }
    public static void main(String[] args) {
        String ge="";
        int num1=0;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the Book Title");
        bookTitle=in.next();
        System.out.println("Enter the Book Author");
        author=in.next();
        System.out.println("Enter the Patron Name");
        pName=in.next();
        new Q7(bookTitle,author,pName);
        System.out.println("enter number of book to borrowed");
        int num=in.nextInt();
        if(num>3){
            for(;;){
        System.out.println("maximum is 3 books re-enter your number below 3");
         num1=in.nextInt();
            if(num1<=3)
            System.out.println("Enter the name of book you wants");
         break;}}
           for(int i=1;i<=num1;i++){
            ge=in.next();
        }
        
          
    }

    
   
    }

