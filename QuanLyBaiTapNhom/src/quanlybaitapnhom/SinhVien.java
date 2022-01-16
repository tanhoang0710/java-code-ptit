/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlybaitapnhom;

/**
 *
 * @author DELL
 */
public class SinhVien implements Comparable<SinhVien>{
    private String ma, hoten, sdt;
    private int sttNhom;

    public SinhVien() {
    }

    public SinhVien(String ma, String hoten, String sdt, int sttNhom) {
        this.ma = ma;
        this.hoten = hoten;
        this.sdt = sdt;
        this.sttNhom = sttNhom;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public int getSttNhom() {
        return sttNhom;
    }

    public void setSttNhom(int sttNhom) {
        this.sttNhom = sttNhom;
    }

    @Override
    public String toString() {
        return ma + " " + hoten + " " + sdt + " " + sttNhom;
    }

    @Override
    public int compareTo(SinhVien o) {
        return this.getMa().compareToIgnoreCase(o.getMa());
    }
    
    
}
