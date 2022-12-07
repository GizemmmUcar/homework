
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
public class example105 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Bir tamsayı giriniz:");
        int a=input.nextInt();
        int t=0;
        int s=0;
        for (int i = 1; i <= a; i++) {
            if (a%i==0) {
                t+=i;
                s++;
            }
        }
        int sayi=t/s;
        int tamsayi;
        tamsayi= (int) sayi;
        double tamsayıcevirme;
        tamsayıcevirme= (double) tamsayi;       
        if (sayi-tamsayıcevirme==0) {
            System.out.println("Aritmetik sayı");
        }
        else {
            System.out.println("Aritmetik sayı değil");
        }
        }
            
        }
    
    

