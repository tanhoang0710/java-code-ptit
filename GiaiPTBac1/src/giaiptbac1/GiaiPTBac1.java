/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package giaiptbac1;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class GiaiPTBac1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        if(a == 0){
            if(b == 0) {
                System.out.println("VSN");
            }else{
                System.out.println("VN");
            }
        }else {
            double kq = -b / a;
            System.out.printf("%.2f", kq);
        }
    }
    
}
