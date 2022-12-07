
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
public class example89 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int s1=0;
        int s2=0;
        int n;
        while(true){
            System.out.print("Lütfen bir tamsayı giriniz: ");
            n=input.nextInt();
            if(n>0){
                break;
            }
        }
        for (int i = 2; i < n; i++) {
            if(n%i==0){
                s1++;
                break;
            }
            if((n+2)%i==0){
                s2++;
                break;
            }
        }
        if(s1==0 && s2==0 && n!=2 && n!=1 && n!=0){
            System.out.print("Sayınız chen asalıdır.");
        }
        else{
            System.out.println("Sayınız chen asalı değildir.");
        }
    }
    
}
