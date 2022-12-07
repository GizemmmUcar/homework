
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
public class example71 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner input = new Scanner(System.in);
       
         System.out.print("Lütfen terim sayısı giriniz: ");
         int x= input.nextInt();
         double t = 0;
         for (int i = 0; i< x ; i++) {
          t+= (double) 1/((2*i+1)*(2*i+2));
           

         }
          System.out.println("Seri açılımı: "+t);
        }
    }
    

