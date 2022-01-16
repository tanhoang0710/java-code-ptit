/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author DELL
 */
public class SinhVien implements Comparable<SinhVien>{
    private String ma, hoten, sdt;

    public SinhVien() {
    }

    public SinhVien(String ma, String hoten, String sdt) {
        this.ma = ma;
        this.hoten = hoten;
        this.sdt = sdt;
    }

    public String getMa() {
        return ma;
    }

    public String getHoten() {
        return hoten;
    }

    public String getSdt() {
        return sdt;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    @Override
    public int compareTo(SinhVien o) {
        return this.getMa().compareToIgnoreCase(o.getMa());
    }
    
    public void show() {
        System.out.println(this.getMa() + " " + this.getHoten() + " " + this.getSdt());
    }
}
