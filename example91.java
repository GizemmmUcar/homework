
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
public class example91 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner input = new Scanner(System.in);
       
         System.out.print("Lütfen bir tamsayı giriniz:");
         int s = input.nextInt();
         int t=0;
         for (int i = 1; i < s-1; i++) {
             if(s%i==0){
                 t+=i;
             }
             else if(s%i!=0){
             }
         }
          if(s==t){
              System.out.println(s+" Mükemmel sayı");
          }
          else if(s!=t){
             System.out.println(s+" Mükemmel sayı değil"); 
          
       
        }
         
         
    }
    
}
