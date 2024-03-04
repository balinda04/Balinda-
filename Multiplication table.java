/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multiplicatioq8;
import java.util.Scanner;

/**
 *
 * @author user
 * 
 */
class multip{
int b;
int a;
int i;
}
public class Multiplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner multi=new Scanner(System.in);
        System.out.println("enter the multiplication value");
   int a=multi.nextInt();
   int n=1;
   for(int i=1;i<=12;i++){
      b=a*i; 
   
   System.out.println(a+"*"+i+"="+a);     // TODO code application logic here
    }
    }  
}
