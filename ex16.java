//package exercise;
//import java.util.Scanner;
//public class ATM {
//   int acc_no;
//   double  acc_bal;
//   
//   ATM( int acc_no,int  acc_bal){
//    this.acc_no=acc_no;
//    this.acc_bal=acc_bal;
//    }
//   class ATM2{
//    ATM2(double amounttodeposit){
//       acc_bal+=amounttodeposit;
//    }}
//   class{
//     ex3(int withdrawamount){
//         if(withdrawamount<acc_bal){
//             System.out.println("amount to withdraw is less than"+acc_bal);
//         }
//         else{
//       acc_bal-=withdrawamount;
//         }
//    }
//public class ex3 {
//    public static void main(String[] args) {
//       ex3 obj=new ex3(1234); 
//    }
//  
//}
import java.util.Scanner;
public class ex16{
    int num1,num2,num3;
    void findLargestNumber(int num1,int num2,int num3){
    this.num1=num1;
     this.num2=num2;
      this.num3=num3;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter first number");
        int nbr1=scanner.nextInt();
        System.out.println("enter second number");
        int nbr2=scanner.nextInt();
        System.out.println("enter thrid number");
        int nbr3=scanner.nextInt();
        if((nbr1 >nbr2)&&(nbr1 >nbr3)){ System.out.println("large number is:"+nbr1);}
        else if((nbr2 >nbr1)&&(nbr2 >nbr3)){ System.out.println("large number is:"+nbr2);}
        else{System.out.println("large number is:"+nbr3);}
    }
}