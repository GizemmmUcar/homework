
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
public class example72 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int max=99;
        int min=1;
        int BS=0;
        int tahmin=0;
        int s=0;
        BS=(int) ((Math.random()*98)*+1);
        do{
            System.out.print("Lütfen 1-99 arasında bir sayı giriniz: ");
            tahmin=input.nextInt();
            s++;
            if(tahmin<BS)
                System.out.print("Daha büyük bir sayı giriniz: ");
            if(tahmin>BS)
                 System.out.print("Daha küçük bir sayı giriniz: ");
            System.out.println("");
        }
        while(tahmin!=BS);
        System.out.println("Tebrikler doğru tahminde bulundunuz! Sayı:"+BS);
        System.out.println(s+" tahminde bulundunuz.");
        
          
    }
    
}
