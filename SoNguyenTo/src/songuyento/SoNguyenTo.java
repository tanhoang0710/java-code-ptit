/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package songuyento;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class SoNguyenTo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int t;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        while(t > 0){
            int n;
            n = sc.nextInt();
            if(isPrime(n)) 
                System.out.println("YES\n");
            else 
                System.out.println("NO\n");
            t--;
        }
    }
    
    public static boolean isPrime(int n) {
        if(n < 2) return false;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0) return false;
        }
        return true;
    }
}
