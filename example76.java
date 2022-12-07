
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
public class example76 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("N:");
        int N=input.nextInt();
        double toplam=0;
        for (int i = 2; i <= (N-2)/2; i+=2) {
            int fakt=1;
            for (int j = 1; j <= i; j++) {
                fakt *=j;
            }
             toplam+= (double)i/fakt;
        
       
        }
    System.out.println("Toplam:"+toplam);
    }
}