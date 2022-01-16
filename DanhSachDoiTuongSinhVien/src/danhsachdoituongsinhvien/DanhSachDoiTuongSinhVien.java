/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package danhsachdoituongsinhvien;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class DanhSachDoiTuongSinhVien {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= n; i++){
            SinhVien sv = new SinhVien(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), Float.parseFloat(sc.nextLine()));
            sv.showProfile();
        }
    }
    
}
