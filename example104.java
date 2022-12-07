
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
public class example104 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Markov sayıları:");
        for (int x = 1; x <= 50; x++) {
            for (int y = x; y <= 50; y++) {
                for (int z = y; z <= 50; z++) {
                    if (x*x+y*y+z*z==3*x*y*z){
                        System.out.println(x+y+z);
                    }
                    else  {
                        
                    }
                }
            }
        }
        
    }
    
}
