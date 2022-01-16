/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuyendung;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class TuyenDung {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        DanhSach ds  = new DanhSach();
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= n; i++) {
            ThiSinh x = new ThiSinh(i, sc.nextLine(), sc.nextLine(), sc.nextLine());
            ds.add(x);
        }
        ds.sapXep();
        ds.show();  
    }
    
}
