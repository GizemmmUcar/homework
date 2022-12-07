
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
public class example75 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        double x;
        double n;
        double sonuc;
        System.out.print("Lütfen x değerini giriniz:");
         x=input.nextDouble();
         System.out.print("Lütfen n değerini giriniz:");
         n=input.nextDouble();
         sonuc=Math.pow((1+x/n),n);
         System.out.print("Sonuç: "+sonuc);
         
        
        
        
        
        
        
    }
    
}
