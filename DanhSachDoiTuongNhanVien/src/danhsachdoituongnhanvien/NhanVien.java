/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package danhsachdoituongnhanvien;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author DELL
 */
public class NhanVien {
    private String ma, hoTen, gioiTinh, ngaySinh, diaChi, maSoThue, ngayKiHD;

    public NhanVien() {
    }

    public NhanVien(int index, String hoTen, String gioiTinh, String ngaySinh, String diaChi, String maSoThue, String ngayKiHD) {
        this.ma = String.format("%05d", index);
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.maSoThue = maSoThue;
        this.ngayKiHD = ngayKiHD;
    }

    public Date getNgaySinh() {
        return new Date(ngaySinh);
    }
    
    public void showProfile() {
        System.out.println(ma + " " + hoTen + " " + gioiTinh + " " + ngaySinh + " " + diaChi + " " + maSoThue + " " + ngayKiHD);
    }
}
