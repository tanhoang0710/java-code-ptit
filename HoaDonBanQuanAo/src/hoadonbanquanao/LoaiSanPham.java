/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoadonbanquanao;

/**
 *
 * @author DELL
 */
public class LoaiSanPham {
    private String maLoai, ten;
    private int donGia1, donGia2;

    public LoaiSanPham() {
    }

    public LoaiSanPham(String maLoai, String ten, int donGia1, int donGia2) {
        this.maLoai = maLoai;
        this.ten = ten;
        this.donGia1 = donGia1;
        this.donGia2 = donGia2;
    }

    public String getMaLoai() {
        return maLoai;
    }

    public void setMaLoai(String maLoai) {
        this.maLoai = maLoai;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getDonGia1() {
        return donGia1;
    }

    public void setDonGia1(int donGia1) {
        this.donGia1 = donGia1;
    }

    public int getDonGia2() {
        return donGia2;
    }

    public void setDonGia2(int donGia2) {
        this.donGia2 = donGia2;
    }
    
    
}
