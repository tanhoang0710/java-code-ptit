/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangdiemthanhphan;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class BangDiemThanhPhan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        DanhSach ds = new DanhSach();
        int n = Integer.parseInt(sc.nextLine());
        while(n-- > 0) {
            SinhVien x = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), Float.parseFloat(sc.nextLine()), Float.parseFloat(sc.nextLine()), Float.parseFloat(sc.nextLine()));
            ds.add(x);
        }
        ds.sapXep();
        ds.show();
    }
    
}
