
import java.util.Scanner;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gizee
 */
public class example73 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner input = new Scanner(System.in);
         Random rand =new Random();
         char random;
         char tahmin;
         int sayac=0;
         random=(char) (rand.nextInt(25)+65);
         while(true){
             
             System.out.println("Bir harf giriniz: ");
             tahmin=input.next().charAt(0);
             tahmin=Character.toUpperCase(tahmin);
             if (sayac==10) {
                 System.out.println("Hakkınız bitti.");
                 break;
             }
             else if(random==tahmin){
             System.out.println(sayac+1+".hakta doğru bildiniz."); 
             break;
         }  
        sayac++;
            }
        }
        
         
    }

  

    


