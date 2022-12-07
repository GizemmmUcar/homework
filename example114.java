
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
public class example114 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Terim saysısı:");
        int n=input.nextInt();
        System.out.println("NegaFibonacci serisi");
        int f1=1;
        int f2=-1;
        
        System.out.println(f1);
        System.out.println(f2);
        for (int i = 1; i <= n-2; i++) {
            int f3=f2-f1;
            System.out.println(f3);
            f1=f2;
            f2=f3;
            
            
        }

    }
    
}
