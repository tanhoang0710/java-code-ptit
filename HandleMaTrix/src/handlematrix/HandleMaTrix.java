/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package handlematrix;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class HandleMaTrix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
             int n = sc.nextInt(), m = sc.nextInt();
             Matrix a = new Matrix(n,m);
             a.nextMatrix(sc);
             Matrix b = a.trans();
             System.out.println(a.mul(b));
        }
    }
    
}
