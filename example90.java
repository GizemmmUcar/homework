
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
public class example90 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in); 
        int s;
        int k;
        int a;
        System.out.print("Üst sınır: ");
        int n =input.nextInt();
        s=0;
        for (int i = 3; i <= n; i++) {
            k=0;
            for (int j = 2; j < i-1; j++) {
                if (i%j==0) {
                    k++;
                }
                if (k==0) {
                    s++;
                    a(s)=i;
                }
            }
        }
        for (int i = 1; i <= s-1; i++) {
            if (a(i+1)-a(i)=2) {
                System.out.println(a(i));
                System.out.println(a(i+1));
                
            }
            
        }
        
    }

}
