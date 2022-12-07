
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
public class example109 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Terim sayısı: ");
        int n=input.nextInt();
         System.out.println("Üçgensel sayılar: ");
        for (int i = 1; i <= n; i++) {
            int u=i*(i+1)/2;
            System.out.println(""+u);
            
        }
    }
    
}
