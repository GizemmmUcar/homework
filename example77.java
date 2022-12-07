
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
public class example77 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner input = new Scanner(System.in);
         int n;
         double t=0;
         System.out.print("Lütfen terim sayısı giriniz:");
         n=input.nextInt();
         for (int i = 0; i < n-1; i++) {
            t+=Math.pow((-1), i)/Math.pow((2*i+1)*3,i);
            
        }
        System.out.print("pi sayısı:"+t);
    }
    
}
