/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xulisophuc;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class XuLiSoPhuc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        while(n-- >0) {
            SoPhuc x1 = new SoPhuc(sc.nextInt(), sc.nextInt());
            SoPhuc x2 = new SoPhuc(sc.nextInt(), sc.nextInt());
            SoPhuc tong = x1.cong(x2);
            SoPhuc res1 = tong.nhan(x1);
            SoPhuc res2 = tong.nhan(tong);
            res1.show();
            System.out.print(", ");
            res2.show();
            System.out.println();
        }
    }
    
}
