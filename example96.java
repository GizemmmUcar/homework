
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
public class example96 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner input = new Scanner(System.in);
         System.out.print("Lütfen pozitif bir tamsayı giriniz:");
         int s=input.nextInt();
         if ((s-1)%4==0) {
             System.out.println(s+" Hilbert sayısıdır");
        }
         else if ((s-1)%4!=0) {
             System.out.println(s+" Hilbert sayısı değildir");
            
        }
    }
    
}
