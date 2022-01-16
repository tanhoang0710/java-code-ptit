/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lophocphan;

/**
 *
 * @author DELL
 */
public class Lop implements Comparable<Lop>{
    private String ma, ten, nhom, tenGV;

    public Lop() {
    }

    public Lop(String ma, String ten, String nhom, String tenGV) {
        this.ma = ma;
        this.ten = ten;
        this.nhom = nhom;
        this.tenGV = tenGV;
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

    public String getNhom() {
        return nhom;
    }

    public void setNhom(String nhom) {
        this.nhom = nhom;
    }

    public String getTenGV() {
        return tenGV;
    }

    public void setTenGV(String tenGV) {
        this.tenGV = tenGV;
    }
    
    public void show() {
        System.out.println(ma + " " + ten + " " + nhom);
    }

    @Override
    public int compareTo(Lop o) {
        if(this.getMa().compareToIgnoreCase(o.getMa()) > 0) return 1;
        else if(this.getMa().compareToIgnoreCase(o.getMa()) < 0) return -1;
        else return this.getNhom().compareTo(o.getNhom());
    }
}
