

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gizee
 */
public class example93 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner input = new Scanner(System.in);
         int a = 0;
         System.out.print("Terim sayısı: ");
            int n=input.nextInt();
                         
        System.out.println("Cullen sayıları:"); 
         for (int i = 1; i < n; i++) {
            a = (int) Math.pow(i*2,i+1);
             System.out.println(""+a); 
        }
               
    }
    
}
