
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
public class example95 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int a;
        System.out.print("x:");
        int x=input.nextInt();
        System.out.print("y:");
        int y=input.nextInt();
        System.out.println("Leynad sayıları:"); 
        for (int i = 2; i < x; i++) {
            for (int j = 2; j < y; j++) {
                a=(int) (Math.pow(i, j)+Math.pow(j, i));
                 System.out.println(""+a); 
                
            }
            
            
        }
        
    }

    
    
}
