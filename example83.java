
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
public class example83 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner input = new Scanner(System.in);
         double ab;
         double cb;
         double ac;
        
         System.out.print("Doğru parçasının uzunluğunu giriniz:");
         ab = input.nextDouble();
         cb = 2*ab/(1+Math.pow(5, 0.5));
         ac=ab-cb;
         System.out.println("Altın oran "+ac);
         System.out.println("Altın oran "+cb);
         
        
        
         
    }
    
}
