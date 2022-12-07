
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
public class example80 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner input = new Scanner(System.in);
         double t=1;
         int n;
         System.out.print("Bölme sayısı:");
         n=input.nextInt();
         for(int i=1;i<= n;i++)
            t=2+1/t;
         System.out.print("Karakök(2)="+(1+1/t));  
         
                 
    }
    
}
