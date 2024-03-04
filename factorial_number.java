/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercise3;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Exercise3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner add=new Scanner(System.in);
        System.out.println("enter the number ");
        int f= add.nextInt();
         int p=1;
         if(f>=0){
        for(int i=1;i<=f;i++){
           p=p*i;
            }  
 
       System.out.println("the fuctoriol of the number : "+p);  
       
    } 
    else{
    System.out.println("invalid input");
}
    
}}
