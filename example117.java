
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
public class example117 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Terim sayısı:");
        int n=input.nextInt();
        System.out.println("Pell sayıları:");
        int P1=0;
        int P2=1;
        System.out.println(P1);
        System.out.println(P2);
        for (int i = 1; i <= n-2; i++) {
            int P3=2*P2+P1;
            System.out.println(P3);
            P1=P2;
            P2=P3;
            
        }
        
    }
    
}
