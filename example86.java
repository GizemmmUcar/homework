
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
public class example86 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner input = new Scanner(System.in);
         int n;
         int s;
         
        
         System.out.print("Belirlediğiniz üst sınırı giriniz:");
         n=input.nextInt();
         System.out.println("Asal sayılar:");
         for (int i = 2; i <= n; i++) {
             s=0;
             for (int j = 1; j <=i; j++) 
                 if(i%j==0)
                     s++;
                 if(s==2)
                  System.out.println(i+"");
                 }
             }
            
        }
    
   

