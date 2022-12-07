
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
public class example100 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir tam sayı giriniz:");
        int s=input.nextInt();
        int t=0;
        for (int i = 1; i <= s; i++) {
            if (s%i==0) {
                t+=i;
            }
        }
        if (t<2*s) {
            System.out.println("Eksik sayıdır ve eksik sayı miktarı="+(2*s-t));
        }
        else if (t>=(2*s)) {
              System.out.println("Eksik sayı değildir");       
            }
        }
    
    }
    

