/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangdiemthanhphan;

/**
 *
 * @author DELL
 */
public class SinhVien implements Comparable<SinhVien>{
    private String ma, ten, lop;
    private float diem1, diem2, diem3;

    public SinhVien() {
    }

    public SinhVien(String ma, String ten, String lop, float diem1, float diem2, float diem3) {
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
    }

    public String getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }
    
    
    
    public void show() {
        System.out.printf(ma + " " + ten + " " + lop + " %.1f %.1f %.1f\n", diem1, diem2, diem3);
    }

    // sap xep theo ma sv
//    @Override 
//    public int compareTo(SinhVien o) {
//        if(this.getMa().compareToIgnoreCase(o.getMa()) > 0) return 1;
//        else if(this.getMa().compareToIgnoreCase(o.getMa()) < 0) return -1;
//        else return 0;
//    }

    
    // sap xep theo ten
    @Override
    public int compareTo(SinhVien o) {
        if(this.getTen().compareToIgnoreCase(o.getTen()) > 0) return 1;
        else if(this.getTen().compareToIgnoreCase(o.getTen()) < 0) return -1;
        else return 0;
    }
    
    
    
}
