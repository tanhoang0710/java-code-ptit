/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doanhngiepsinhvien;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class DoanhNgiepSinhVien {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner sc = new Scanner(new File("DN.in"));
        DanhSach ds = new DanhSach();
        int n = Integer.parseInt(sc.nextLine());
        while(n-- > 0) {
            DoanhNghiep x = new DoanhNghiep(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()));
            ds.add(x);
        }
        ds.sapXep();
        ds.show();
//        int a, b;
//        int q = Integer.parseInt(sc.nextLine());
//        while(q-- >0) {
//            a = sc.nextInt();
//            b = sc.nextInt();
//            ds.loc(a, b);
//        }
    }
    
}
