/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        int t;
        long f[] = new long[95];
        Scanner sc = new Scanner(System.in);
        t = Integer.parseInt(sc.nextLine());
        f[0] = 0; f[1] = 1; f[2] = 1;
        for(int i=3; i <= 92; i++)
            f[i] = f[i-1] + f[i-2];
        
        while(t-- > 0){
            long n;
            n = sc.nextLong();
            boolean check = false;
            for (int i = 0; i < f.length; i++) {
                if(n == f[i]) {
                    check = true;
                    break;
                }
            }
            if(check) {
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }
}
