/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlibanhang;

/**
 *
 * @author DELL
 */
public class KhachHang {
    private String ma, ten, gioiTinh, ngaySinh, diaChi;

    public KhachHang() {
    }

    public KhachHang(int index, String ten, String gioiTinh, String ngaySinh, String diaChi) {
        this.ma = "KH" + String.format("%03d", index);
        this.ten = ten;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    
    public void show() {
        System.out.println(this.getMa() + " " + this.getTen() + " " + this.getDiaChi());
    }
}
