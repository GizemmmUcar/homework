
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
public class example103 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Bir tamsayı giriniz:");
        int a=input.nextInt();
        int s=0;
        int t=0;
        for (int i = 1; i <= a; i++) {
            if (a%i==0) {
                s++;
                t+=1/i;
            }
            
        }
        int h=s/t;
        if (h==Math.round(h)){
                System.out.println("Ore sayısı");
                
            }
        else if(h!=Math.round(h)) {
            System.out.println("ore sayısı değil");
        
        }
    }
    }
        
      
        
    
    

