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
public class SanPham implements Comparable<SanPham>{
    private String ma, ten, tgbh;
    private int giaBan;

    public SanPham() {
    }

    public SanPham(String ma, String ten, int giaBan, String tgbh) {
        this.ma = ma;
        this.ten = ten;
        this.giaBan = giaBan;
        this.tgbh = tgbh;
    }

    public int getGiaBan() {
        return giaBan;
    }

    public String getMa() {
        return ma;
    }
    
    public void show() {
        System.out.println(ma + " " + ten + " " + giaBan + " " + tgbh);
    }

    @Override
    public int compareTo(SanPham o) {
        if( this.getGiaBan() > o.getGiaBan()) return -1;
        else if( this.getGiaBan() < o.getGiaBan()) return 1;
        else return this.getMa().compareToIgnoreCase(o.getMa());
    }
}
