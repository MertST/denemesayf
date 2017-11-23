/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication16;

import java.util.Scanner;

/**
 *
 * @author Mert Teke
 */
public class JavaApplication16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner tara=new Scanner(System.in);
            int a,b,c;
    System.out.print("a= ");
    a=tara.nextInt();
    System.out.print("b= ");
    b=tara.nextInt();
    System.out.print("c= ");
    c=tara.nextInt();
    System.out.println((Math.pow(a,b)-(2*(c*a)))/(Math.pow(b, c)-5));
    }
    
}
