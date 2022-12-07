
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
public class example74 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int n;
        double x;
        double T=1;
        double F=1;
        System.out.println("Terim sayısı giriniz: ");
        n=input.nextInt();
        System.out.println("x değerini giriniz: ");
        x=input.nextInt();
        for (int i = 1; i < n-1; i++) {
            F*=i;
            T+= Math.pow(x,i)/F;
        }
        System.out.println("Seri açılımı ile e^3 değeri: "+T);
        System.out.println("Komutla e^3 değeri: "+Math.exp(x));
    }
    
}
