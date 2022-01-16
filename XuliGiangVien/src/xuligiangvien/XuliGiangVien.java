/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xuligiangvien;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class XuliGiangVien {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DanhSach ds = new DanhSach();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= n; i++) {
            GiangVien gv = new GiangVien(i, sc.nextLine(), sc.nextLine());
            ds.add(gv);
        }
        int q = Integer.parseInt(sc.nextLine());
        while(q-- > 0){
            //String boMon = sc.nextLine();
            String s = sc.nextLine();
            //ds.loc(boMon);
            ds.locTenGanDung(s);
        }
        
    }
    
}
