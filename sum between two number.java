/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercise_2;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Exercise_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner add=new Scanner(System.in);
        System.out.println("enter the first number ");
        int x= add.nextInt();
        System.out.println("enter the second number ");
        int m= add.nextInt();
         int sum=0;
        for(int i=x;i<m;i++){
           
           sum=sum+i;
            }  
 
       System.out.println("Sum of given number is : "+sum);  
        // TODO code application logic here
    }
    
}
