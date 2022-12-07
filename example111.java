
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
public class example111 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Terim sayısı:");
        int N=input.nextInt();
        int T1=1;
        int T2=1;
        System.out.println("T1:"+T1);
        System.out.println("T2:"+T2);
        for (int i = 1; i <= N-2; i++) {
            int T3=T1+T2;
            System.out.println("T3:"+T3);
            T1=T2;
            T2=T3;
        }
        
    }
    
}
