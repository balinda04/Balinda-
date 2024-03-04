
package exercise;

import java.util.Scanner;

public class ex20 {
    public static void main(String[] args) {
        Scanner get=new Scanner(System.in);
        System.out.println("Enter the year you need");
        int year=get.nextInt();
        if(year%400==0){
            System.out.println("the year is leap");
        }
        else{System.out.println("the year is not leap");}
    }
    
}
 

