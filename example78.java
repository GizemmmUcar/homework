
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
public class example78 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int n;
        double c=1;
        double c1;
        double a = 0;
       
         System.out.print("Terim sayısı: ");
         n=input.nextInt();
         for (int i = 1; i < n; i++) {
             c1=4*i*i;
             c=c*c1/(c1-1);
             a = c*2;
          
        }
         System.out.println("John Wallis ardışık çarpımı ile hesaplanan pi sayısı:"+a);   
    }
    
}
