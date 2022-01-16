/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitoantuyensinh;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DELL
 */
public class BaiToanTuyenSinh {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            Scanner sc = new Scanner(new File("THISINH.in"));
            int n = Integer.parseInt(sc.nextLine());
            DanhSach ds = new DanhSach();
            while(n-- > 0){
                ThiSinh t = new ThiSinh(sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()));
                ds.add(t);
            }
            int ct = Integer.parseInt(sc.nextLine());
            ds.setChiTieu(ct);
            System.out.println(ds.getDiemChuan());
            ds.show();
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        }
    }
    
}
