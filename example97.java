
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
public class example97 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("a:");
        int a=input.nextInt();
        System.out.print("b:");
        int b=input.nextInt();    
        int ta=0;
        int tb=0;
        for (int i = 1; i < a-1; i++) {
            if (a%i==0) {
                ta=ta+i;
                
            }
        }
        for (int i = 1; i < b-1; i++) {
            if (b%i==0) {
                tb=tb+i;
            }
        }
        if (ta==b && tb==a) {
            System.out.println("Dost sayılar");
        }
        
         else {
            System.out.println("Dost sayılar değil");
              }      
         }
            
        }

    
    

