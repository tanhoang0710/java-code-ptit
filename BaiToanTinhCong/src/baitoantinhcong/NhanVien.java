/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitoantinhcong;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class NhanVien {
    private String ma, ten;
    private int luongCB, soNgayCong;
    private String chucVu;

    public NhanVien() {
        ma = "NV01";
    }

//    public NhanVien(String ma, String ten, int luongCB, int soNgayCong, String chucVu) {
//        this.ma = ma;
//        this.ten = ten;
//        this.luongCB = luongCB;
//        this.soNgayCong = soNgayCong;
//        this.chucVu = chucVu;
//    }
    
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        this.ten = sc.nextLine();
        this.luongCB = Integer.parseInt(sc.nextLine());
        this.soNgayCong = Integer.parseInt(sc.nextLine());
        this.chucVu = sc.nextLine();
    }
    
    public void showProfile() {
        int luong = luongCB * soNgayCong;
        double thuong = 0;
        if(soNgayCong >= 25)
            thuong = luong * 0.2;
        else if(soNgayCong >= 22)
            thuong = luong * 0.1;
        else 
            thuong = 0;
        
        int phuCap = 0;
        if(chucVu.equalsIgnoreCase("GD")){
            phuCap = 250000;
        } 
        else if(chucVu.equalsIgnoreCase("PGD")){
            phuCap = 200000;
        }  
        else if(chucVu.equalsIgnoreCase("TP")){
            phuCap = 180000;    
        } 
        else if(chucVu.equalsIgnoreCase("NV")){
            phuCap = 150000;
        }
        double thuNhap = (luong + thuong + phuCap);
        System.out.printf(ma + " " + ten + " " + luong + " %.0f %d %.0f " ,thuong, phuCap, thuNhap);
    }
}
