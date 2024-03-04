/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package maximum;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Maximum {
    public static void main(String[] args) {
        Scanner add=new Scanner(System.in);
        System.out.println("enter the first number");
        int x= add.nextInt();
        System.out.println("enter the second number");
        int m= add.nextInt();
        System.out.println("enter the thurd number");
        int n= add.nextInt();
         if((x>m)&&(x>n)){
         System.out.println("the maximum number is "+x);
    }
         else if((m>x && m>n)){
        System.out.println("the maximum number is"+m);
    }
         else if((n>x)&&(n>m)){
        System.out.println("the maximum number is"+n);
    }
         else{
             System.out.println("all number are equel");
         }
        
    } 
    }
    

