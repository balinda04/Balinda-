package assignement;
import java.util.Scanner;
class sumOfNumber{
    int number1;
     int number2;
     static int sum=0;
 static int calculate(int number1,int number2){
 number1=number1;
 number2=number2;
     for(int i=number1;i<=number2;i++){
     sum+=i;
     }
     return sum;
 }
}
public class Q11 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the First number");
        int num1=scanner.nextInt();
        System.out.println("Enter the second number");
        int num2=scanner.nextInt();
        sumOfNumber obj=new sumOfNumber();
      System.out.println("sum between"+" "+num1+""+"and"+" "+num2+"="+obj.calculate(num1,num2));
        
    }
 
}
