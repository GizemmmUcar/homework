
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
public class example118 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int m, n;
        System.out.print("m degerini giriniz :");
        m = sc.nextInt();
        System.out.print("n degerini giriniz :");
        n = sc.nextInt();
        
        System.out.println(delannoy(m, n));
        
    }
    public static int delannoy(int m, int n) {
        if (m == 0 || n == 0) {
            return 1;
        }
        return delannoy(m - 1, n) + delannoy(m - 1, n - 1) + delannoy(m, n - 1);
    }
    
}

    }
    
}
