
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
public class example107 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Basamak sayısı: ");
        int n=input.nextInt();
        double a;
        a = 9*(Math.pow(10, ((n-1)/2)));
        System.out.println("Palindrom tamsayıların toplamı: "+a);
              
    }
    
}
