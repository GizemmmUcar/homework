
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
public class example120 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir tamsayı giriniz: ");
        int n=input.nextInt();
        for (int a = 1; a <= n-1; a++) {
            for (int b = a+1; b <= n-a; b++) {
                int c=n-(a+b);
                if (Math.pow(a, 2)+Math.pow(b, 2)==Math.pow(c, 2)) {
                    System.out.println(a);
                    System.out.println(b);
                    System.out.println(c);
                    System.out.println(a*b*c);
                }
                
            }
            
        }

    }
    
}
