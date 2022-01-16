/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package khaibaolopnhanvien;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class NhanVien {
    private String maNV, hoTen, gioiTinh, ngaySinh, diaChi, maSoThue, ngayKiHopDong;
    private static Scanner sc = new Scanner(System.in);

    public NhanVien() {
        this.maNV = "00001";
    }
    
    public void nhap() {
        this.hoTen = sc.nextLine();
        this.gioiTinh = sc.nextLine();
        this.ngaySinh = sc.nextLine();
        this.diaChi = sc.nextLine();
        this.maSoThue = sc.nextLine();
        this.ngayKiHopDong = sc.nextLine();
    }
    
    public void showProfile() {
        System.out.println(maNV + " " + hoTen + " " + gioiTinh + " " + ngaySinh + " " + diaChi + " " + maSoThue + " " + ngayKiHopDong + "\n");
    }
}
