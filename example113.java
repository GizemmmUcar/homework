
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
public class example113 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Terim sayısı:");
        int n =input.nextInt();
        
        int f1=1;
        int f2=1;
        int s2=0;
        int f3 = 0;
        int s1 = 0;
        
        while(s2<n) {
            f3=f1+f2;
            f1=f2;
            f2=f3;
            s1=0;
            
         
        for (int i = 2; i <= f3-1; i++)  {
            if (f3%i==0) {
                s1++;
            }
                
        }
        if (s1==0) {
            s2++;
            System.out.println(f3);
        }
        }    
            
        }
                
        
    }
    

