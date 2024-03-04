/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercises;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Exercises {

   
    float l;
    float w;

    void rectangle(float len, float wid) {
        float l = len;
        float w = wid;
        

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner areap = new Scanner(System.in);
        System.out.println("enter the length");
        float len = areap.nextFloat();
        System.out.println("enter the width");
        float wid = areap.nextFloat();
        float area=len*wid;
        System.out.println("area of rectangle is :"+area);
       float perimeter=(len*wid)/2;
        System.out.println("perimeter of rectangle is:"+perimeter);
        // TODO code application logic here
    }   

}
