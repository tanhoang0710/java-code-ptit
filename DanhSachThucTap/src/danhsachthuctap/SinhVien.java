/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package danhsachthuctap;

/**
 *
 * @author DELL
 */
public class SinhVien implements Comparable<SinhVien>{
    private String stt, ma, ten, lop, email, doanhNghiep;

    public SinhVien() {
    }

    public SinhVien(int index, String ma, String ten, String lop, String email, String doanhNghiep) {
        this.stt = String.format("%01d", index);
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.email = email;
        this.doanhNghiep = doanhNghiep;
    }

    public String getTen() {
        return ten;
    }

    public String getDoanhNghiep() {
        return doanhNghiep;
    }

    public String getMa() {
        return ma;
    }

    public void show() {
        System.out.println(stt + " " + ma + " " + ten + " " + lop + " " + email + " " + doanhNghiep);
    }    

    
//    sap xep ho ten
//    @Override
//    public int compareTo(SinhVien o) {
//        if(this.getTen().compareToIgnoreCase(o.getTen()) > 0) return 1;
//        else if(this.getTen().compareToIgnoreCase(o.getTen()) < 0) return -1;
//        else return 0;
//    }

    @Override
    public int compareTo(SinhVien o) {
        if(this.getMa().compareToIgnoreCase(o.getMa()) > 0) return 1;
        else if(this.getMa().compareToIgnoreCase(o.getMa()) < 0) return -1;
        else return 0;
    }
    
    
}
