/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xulinhanvien;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class XuLiNhanVien {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        DanhSach ds = new DanhSach();
        for(int i = 1; i <= n; i++){
            NhanVien x = new NhanVien(i, sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()));
            ds.add(x);
        }
        ds.sapXep();
        ds.show();
    }
    
}
