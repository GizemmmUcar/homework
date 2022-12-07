
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
public class example82 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner input = new Scanner(System.in);
 
        System.out.print("Bölüm sayısı giriniz:");
        int n = input.nextInt();
        int t=1;
      
        for (int i = 1; i < n; i++) {
            t=4+1/t;
        }
        int sonuc = 2+1/t;
        
        System.out.println("Kök 5 değeri:"+sonuc);
      
    }
    
}
