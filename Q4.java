package assignement;
import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
        Scanner getUserInput=new Scanner(System.in);
        System.out.println("Enter the Password Criteria");
        String get=getUserInput.next();
        if(get.contains("abc")){
            System.out.println("get first one");
        }
        else if(get.contains("def")){
            System.out.println("get second one");
        }
        else{
            System.out.println("get Thrid one");
        }
    }
}
