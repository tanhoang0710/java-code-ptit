/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chuvitamgiac;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class ChuViTamGiac {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0) {
            double x1, x2, y1, y2, x3, y3;
            x1 = sc.nextDouble();
            y1 = sc.nextDouble();
            x2 = sc.nextDouble();
            y2 = sc.nextDouble();
            x3 = sc.nextDouble();
            y3 = sc.nextDouble();
            Point p1 = new Point(x1, y1);
            Point p2 = new Point(x2, y2);
            Point p3 = new Point(x3, y3);
            TamGiac tg = new TamGiac(p1, p2, p3);
            tg.dienTichDuongTronNgoaiTiep();
            t -= 1;
        }
    }
    
}
