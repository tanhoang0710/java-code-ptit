/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package danhsachmonhoc;

/**
 *
 * @author DELL
 */
public class MonHoc implements Comparable<MonHoc>{
    private String ma, ten;
    private int soTinChi;

    public MonHoc() {
    }

    public MonHoc(String ma, String ten, int soTinChi) {
        this.ma = ma;
        this.ten = ten;
        this.soTinChi = soTinChi;
    }

    public String getTen() {
        return ten;
    }

    @Override
    public int compareTo(MonHoc o) {
        return this.getTen().compareToIgnoreCase(o.getTen());
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + soTinChi; //To change body of generated methods, choose Tools | Templates.
    }
    
}
