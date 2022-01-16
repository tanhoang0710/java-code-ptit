/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nhapxuathang;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class NhapXuatHang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        DanhSach ds = new DanhSach();
        int n = Integer.parseInt(sc.nextLine());
        while(n-- > 0){
            SanPham x = new SanPham(sc.nextLine(), Integer.parseInt(sc.nextLine()));
            ds.add(x);
        }
        String s = sc.nextLine();
        ds.loc(s);
    }
    
}
