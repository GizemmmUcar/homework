
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
public class example85 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        double b;
        double a;
        System.out.print("Doğru parçasının uzunluğunu giriniz:");
        int u=input.nextInt();
        
        b=u/(2+Math.pow(2, 5));
        a=u-b;
        System.out.println("Gümüş orana uygun bölünen 1.parça: "+a);
        System.out.println("Gümüş orana uygun bölünen 2.parça: "+b);
        
    }
    
}
