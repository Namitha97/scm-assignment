/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prime;

import java.util.Scanner;


public class Prime {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
    System.out.print("Enter a number to reverse:  ");
    int x=5;
    int y=6;
    
    //with using third variable
    
    int temp=x;
    x=y;
    y=temp;
    
     System.out.println("x is "+ x +"y is" +y);
   
       }
    
}


