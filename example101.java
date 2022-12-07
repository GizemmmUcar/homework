
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
public class example101 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Üst sınır giriniz:");
        int N=input.nextInt();
        for (int i = 1; i <= N; i++) {
            int s=0;
            for (int j = 1; j <= i; j++) {
                if (i%j==0) {
                    s++;
                }
            }    
                if (i%s==0) {
                    System.out.println(i);
                }
            
                
        }
            
        }
    }
    

