
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
public class example81 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
      
      
        System.out.print("n:");
        int n = input.nextInt();
        double t=1;
      
        for (int i = 1; i < n-1; i++) {
            t=1+1/(2+1/t);
        }
        double  sonuc = 1+1/t;
        
        System.out.println("Sonuç:"+sonuc);
      
    }
    
}
