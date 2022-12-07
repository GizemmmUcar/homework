
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
public class example116 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Fibonacci sayısı:");
        double f2=input.nextDouble();
        double ao=(1+Math.pow(5, 5))/2;
        
     
        
        double sayi1=f2/ao;
        int tamsayi;
        tamsayi= (int) sayi1;
        double tamsayıcevirme;
        tamsayıcevirme= (double) tamsayi;       
        if (sayi1-tamsayıcevirme==0) {
         
        }
        double f1=sayi1;
        
        
        double sayi2=f2*ao;
        int tamsayi2;
        tamsayi2= (int) sayi2;
        double tamsayıcevirme2;
        tamsayıcevirme2= (double) tamsayi2;       
        if (sayi2-tamsayıcevirme2==0) {
         
        }
        double f3=sayi2;
        
        System.out.println(f1+f2+f3);
        
        
        
        
        
    
    }
    
}
