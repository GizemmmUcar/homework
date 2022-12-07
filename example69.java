
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
public class example69 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner input = new Scanner(System.in);
          int N ;
          int isaret;
          double aci=1;
          double X=1;
          double F=1;
          double T=1;

          System.out.print("Açı değeri: ");
          aci = input.nextDouble();
          System.out.print("Terim sayısı: ");
          N = input.nextInt();
          X=Math.toRadians(aci);
          isaret=1;
          for (int i = 1; i <= N; i++) {
              F=1;
              for (int j = 1; j <= 2*i; j++) {
                  F *=j;
                  isaret *=(-1);
                  T+=isaret * Math.pow(X, 2*i)/F;
              }
                  System.out.println("Seri açılımı ile hesaplanan değer: "+T);
                  System.out.println("Komutla hesaplanan değer: "+Math.cos(X));
                  
                  
                  
                  
              }
            
        }
          
           
              
              }
            
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    
    

